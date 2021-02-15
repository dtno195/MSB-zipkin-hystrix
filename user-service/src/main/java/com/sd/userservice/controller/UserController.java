package com.sd.userservice.controller;

import com.sd.userservice.entity.User;
import com.sd.userservice.service.UserService;
import com.sd.userservice.valueobject.ResponseTemplateValueObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
  @Autowired
  private UserService service;

  @PostMapping("/")
  public User saveUser(@RequestBody User user) {
    log.info("Inside save user of User controller");
    return service.saveUser(user);
  }

  @GetMapping("/{id}")
  public ResponseTemplateValueObject getUserWithDepartment(@PathVariable("id") Long userId) {
    log.info("Inside find user of User controller");
    return service.getUserWithDepartment(userId);
  }
}
