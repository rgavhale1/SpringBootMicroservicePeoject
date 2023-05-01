package com.raj.tech.employeeService.repository;

import com.raj.tech.employeeService.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {}
