package com.sri.jpa;

import com.sri.jpa.service.EmployeeManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaManyToOneApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(JpaManyToOneApplication.class, args);
        EmployeeManagement employeeManagement = container.getBean(EmployeeManagement.class);
        employeeManagement.addEmployee();
    }

}
