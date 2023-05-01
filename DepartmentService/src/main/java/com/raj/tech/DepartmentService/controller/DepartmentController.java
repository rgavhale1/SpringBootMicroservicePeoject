package com.raj.tech.DepartmentService.controller;

import com.raj.tech.DepartmentService.model.Department;
import com.raj.tech.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
@RequestMapping("/api/department")
@Slf4j
public class DepartmentController {
  @Autowired private DepartmentService departmentService;

  @Value("${spring.raje.message}")
  String message;

  @PostMapping("/save")
  public ResponseEntity<String> saveDepartment(@RequestBody Department department) {
    int sum = 0;
    for (int i = 0; i < 12; i++) sum += i;
    System.out.println("x:" + i);
    Department save = departmentService.saveDepartment(department);

    log.info("Saved department: " + save.toString());
    return new ResponseEntity(save.getId(), HttpStatus.OK);
  }

  @GetMapping("/get/{id}")
  public ResponseEntity<String> getDepartmentByCode(@PathVariable("id") String departmentCode) {
    Department save = departmentService.getDepartment(departmentCode);

    log.info("Get Department: " + save.toString());
    log.info("Get Department: " + save.toString() + " projectName" + message);

    return new ResponseEntity(save, HttpStatus.OK);
  }
}
