package com.raj.tech.DepartmentService.service;

import com.raj.tech.DepartmentService.model.Department;

public interface DepartmentService {

  Department saveDepartment(Department department);

  Department getDepartment(String departmentCode);
}
