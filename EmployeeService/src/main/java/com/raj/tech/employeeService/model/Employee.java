package com.raj.tech.employeeService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Employee")
public class Employee {

  private Long id;
  private String employeeName;
  private String employeeLastName;
  private String employeeEmail;
  private String departmentCode;
}
