package com.raj.tech.employeeService.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
@FeignClient(url = "http://localhost:8083", value = "DEPARTMENT-SERVICE")
public interface ApiClient {

  @GetMapping("api/get/department/{id}")
  public Department getDepartmentDetails(@PathVariable("id") String departmentCode);
}
*/

@FeignClient(url = "http://localhost:8083", value = "DEPARTMENT-SERVICE")
public interface ApiClient {

  @GetMapping("/api/department/get/{id}")
  public Department getDepartmentDetails(@PathVariable("id") String departmentCode);
}
