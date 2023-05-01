package com.raj.tech.DepartmentService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Department")
public class Department {
  @Id private Long id;
  private String departmentName;
  private String departmentDescription;
  private String departmentCode;
}
