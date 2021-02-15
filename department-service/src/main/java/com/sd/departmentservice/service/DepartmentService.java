package com.sd.departmentservice.service;

import com.sd.departmentservice.entity.Department;
import com.sd.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
  @Autowired
  private DepartmentRepository repository;

  public Department saveDepartment(Department department) {
    return repository.save(department);
  }

  public Department findDepartmentById(Long departmentId) {
    return repository.findByDepartmentId(departmentId);
  }
}
