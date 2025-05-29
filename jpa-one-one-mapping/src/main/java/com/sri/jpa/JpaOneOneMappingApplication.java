package com.sri.jpa;

import com.sri.jpa.service.EmpOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaOneOneMappingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(JpaOneOneMappingApplication.class, args);
        EmpOperations empOperations = container.getBean(EmpOperations.class);
        empOperations.addEmployee();
        //empOperations.deleteEmployee(1101);
        empOperations.getEmployeeInfo(1000L);
    }

}
