package com.raj.tech.employeeService.service;

import com.raj.tech.employeeService.model.ApiResponse;
import com.raj.tech.employeeService.model.Employee;

public interface EmployeeService {
  Employee saveEmployeeData(Employee employee);

  Employee getEmployeeById(Long id);

  ApiResponse getEmployeeDetailsById(Long id);
}
