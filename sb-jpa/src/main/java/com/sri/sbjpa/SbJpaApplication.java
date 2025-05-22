package com.sri.sbjpa;

import com.sri.sbjpa.operations.EmployeeOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SbJpaApplication.class, args);
        EmployeeOperations employeeOperations = container.getBean(EmployeeOperations.class);
        //employeeOperations.addMoreEmployees();
        employeeOperations.loadEmployeeInformationByEmpId(1);
        employeeOperations.loadEmployeeInformation();
        employeeOperations.getEmployeesByCity("Munich");
    }

}
