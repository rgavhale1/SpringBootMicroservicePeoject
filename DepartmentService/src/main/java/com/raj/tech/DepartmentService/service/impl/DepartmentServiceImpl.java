package com.raj.tech.DepartmentService.service.impl;

import com.raj.tech.DepartmentService.model.Department;
import com.raj.tech.DepartmentService.repository.DepartmentRepository;
import com.raj.tech.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
  @Value("${spring.raje.message}")
  String message;

  private DepartmentRepository departmentRepository;

  public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
    this.departmentRepository = departmentRepository;
  }

  @Override
  public Department saveDepartment(Department department) {
    Department savedDepartment = departmentRepository.save(department);
    return savedDepartment;
  }

  @Override
  public Department getDepartment(String departmentCode) {
    log.info("department service: " + message);
    Department department = departmentRepository.findByDepartmentCode(departmentCode);
    return department;
  }
}
