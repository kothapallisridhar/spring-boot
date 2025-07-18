package com.sri.sbjpa;

import com.sri.sbjpa.operations.EmployeeOperations;
import com.sri.sbjpa.operations.EmployeeOperationsNativeSql;
import com.sri.sbjpa.operations.EmployeeOperationsTwo;
import com.sri.sbjpa.operations.EmployeeOperationsPagination;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SbJpaApplication.class, args);
        EmployeeOperations employeeOperations = container.getBean(EmployeeOperations.class);
        EmployeeOperationsTwo employeeOperationsTwo = container.getBean(EmployeeOperationsTwo.class);
        /*employeeOperations.addMoreEmployees();
        employeeOperations.loadEmployeeInformationByEmpId(1);
        employeeOperations.loadEmployeeInformation();
        employeeOperations.getEmployeesByCity("Munich");
        employeeOperations.getEmployeesByCity("Bangalore");
        employeeOperations.getEmployeesByGender("Male");
        employeeOperations.getEmployeesByGenderAndCountry("Male", "Germany");
        employeeOperations.getEmployeesByGenderAndCityAndCountry("Female", "Bangalore", "India");
        employeeOperations.getEmployeesByGenderOrCity("Female", "Bangalore");
        employeeOperationsTwo.deleteEmployeeById(10);
        employeeOperationsTwo.deleteByCountry("USA");

        employeeOperationsTwo.updateEmployeeSalaryByEmployeeId(3, 600000);
        employeeOperationsTwo.updateEmployeeSalaryByEmpId(5, 600000);

        System.out.println("All employees in order by empId");
        employeeOperations.loadAllEmployeesByEidAsc();

        System.out.println("All employees in descending order by empId");
        employeeOperations.loadAllEmployeesByEidDesc();

        System.out.println("All employees in ascending order by city name");
        employeeOperations.loadAllEmployeesByCityNameAsc();

        EmployeeOperationsPagination employeeDetails = container.getBean(EmployeeOperationsPagination.class);
        employeeDetails.getEmpInformation();
        employeeDetails.getEmpDetails(1, 5); */
        EmployeeOperationsNativeSql employeeOperationsNativeSql = container.getBean(EmployeeOperationsNativeSql.class);
        //employeeOperationsNativeSql.loadEmployees();
        //employeeOperationsNativeSql.loadEmployeesByCity("Hyderabad");
        employeeOperationsNativeSql.loadEmployeesByCityAndAge("Bangalore", 30);
        employeeOperationsNativeSql.addNewEmployee();
        //employeeOperationsNativeSql.deleteEmployee(68);
    }

}
