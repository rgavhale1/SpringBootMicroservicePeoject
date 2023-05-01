package com.raj.tech.employeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {

  /*  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }*/

  /*@Bean
  WebClient webClient() {
    return WebClient.builder().build();
  }*/

  public static void main(String[] args) {
    SpringApplication.run(EmployeeServiceApplication.class, args);
  }
}
