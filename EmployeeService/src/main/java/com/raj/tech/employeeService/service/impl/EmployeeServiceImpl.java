package com.raj.tech.employeeService.service.impl;

import com.raj.tech.employeeService.model.ApiClient;
import com.raj.tech.employeeService.model.ApiResponse;
import com.raj.tech.employeeService.model.Department;
import com.raj.tech.employeeService.model.Employee;
import com.raj.tech.employeeService.repository.EmployeeRepository;
import com.raj.tech.employeeService.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeeRepository;

  // private RestTemplate restTemplate;
  // private WebClient webClient;

  private ApiClient apiClient;

  @Override
  public Employee saveEmployeeData(Employee employee) {
    Employee savedEmployee = employeeRepository.save(employee);

    return savedEmployee;
  }

  @Override
  public Employee getEmployeeById(Long id) {
    Optional<Employee> employee = employeeRepository.findById(id);
    return employee.get();
  }

  @Override
  public ApiResponse getEmployeeDetailsById(Long id) {
    Optional<Employee> employee = employeeRepository.findById(id);
    Employee employeeData = employee.get();

    /*   Department department =
    restTemplate.getForObject(
        "http://localhost:8083/api/get/department/" + employeeData.getDepartmentCode(),
        Department.class);*/

    /*  Department department =
    webClient
        .get()
        .uri("http://localhost:8083/api/get/department/" + employeeData.getDepartmentCode())
        .retrieve()
        .bodyToMono(Department.class)
        .block();*/

    Department department = apiClient.getDepartmentDetails(employeeData.getDepartmentCode());

    return ApiResponse.builder().employee(employeeData).department(department).build();
  }
}
