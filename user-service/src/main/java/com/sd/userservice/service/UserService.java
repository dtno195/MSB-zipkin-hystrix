package com.sd.userservice.service;

import com.sd.userservice.entity.User;
import com.sd.userservice.repository.UserRepository;
import com.sd.userservice.valueobject.DepartmentValueObject;
import com.sd.userservice.valueobject.ResponseTemplateValueObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
  @Autowired
  private UserRepository repository;

  @Autowired
  private RestTemplate restTemplate;

  public User saveUser(User user) {
    log.info("Inside save user of User service");
    return repository.save(user);
  }

  public ResponseTemplateValueObject getUserWithDepartment(Long userId) {
    log.info("Inside getUserWithDepartment of User service");
    User user = repository.findByUserId(userId);

    DepartmentValueObject department =
            restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                    DepartmentValueObject.class);

    ResponseTemplateValueObject vo = new ResponseTemplateValueObject();
    vo.setUser(user);
    vo.setDepartment(department);
    return vo;
  }
}
