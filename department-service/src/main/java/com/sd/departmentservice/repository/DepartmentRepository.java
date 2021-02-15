package com.sd.departmentservice.repository;

import com.sd.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
  Department findByDepartmentId(Long departmentId);
}
