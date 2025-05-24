package com.sri.sbjpa;

import com.sri.sbjpa.operations.EmployeeOperations;
import com.sri.sbjpa.operations.EmployeeOperationsTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SbJpaApplication.class, args);
        EmployeeOperations employeeOperations = container.getBean(EmployeeOperations.class);
        EmployeeOperationsTwo employeeOperationsTwo = container.getBean(EmployeeOperationsTwo.class);
        employeeOperations.addMoreEmployees();
//        employeeOperations.loadEmployeeInformationByEmpId(1);
//        employeeOperations.loadEmployeeInformation();
//        employeeOperations.getEmployeesByCity("Munich");
//        employeeOperations.getEmployeesByCity("Bangalore");
//        employeeOperations.getEmployeesByGender("Male");
//        employeeOperations.getEmployeesByGenderAndCountry("Male", "Germany");
//        employeeOperations.getEmployeesByGenderAndCityAndCountry("Female", "Bangalore", "India");
//        employeeOperations.getEmployeesByGenderOrCity("Female", "Bangalore");
        //employeeOperationsTwo.deleteEmployeeById(10);
        //employeeOperationsTwo.deleteByCountry("USA");

        //employeeOperationsTwo.updateEmployeeSalaryByEmployeeId(3, 600000);
        //employeeOperationsTwo.updateEmployeeSalaryByEmpId(5, 600000);
    }

}
