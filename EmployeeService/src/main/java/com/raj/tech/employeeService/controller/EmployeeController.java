package com.raj.tech.employeeService.controller;

import com.raj.tech.employeeService.model.ApiResponse;
import com.raj.tech.employeeService.model.Employee;
import com.raj.tech.employeeService.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
@RequestMapping("/api/employee")
@Slf4j
public class EmployeeController {

  private EmployeeService employeeService;

  @Value("${spring.raje.message}")
  String message;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @PostMapping("/save")
  public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
    Employee savedEmployee = employeeService.saveEmployeeData(employee);
    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
  }

  @GetMapping("/get/details/{id}")
  public ResponseEntity<ApiResponse> getEmployeeDetails(@PathVariable("id") Long id) {
    log.info("employee deatils info : " + message);
    ApiResponse apiResponse = employeeService.getEmployeeDetailsById(id);
    return new ResponseEntity<>(apiResponse, HttpStatus.OK);
  }
}
