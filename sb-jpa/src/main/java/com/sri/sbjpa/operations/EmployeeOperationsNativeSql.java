package com.sri.sbjpa.operations;

import com.sri.sbjpa.entity.EmployeeDetails;
import com.sri.sbjpa.repository.EmployeeRepository;
import com.sri.sbjpa.repository.EmployeeRepositoryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeOperationsNativeSql {
    @Autowired
    EmployeeRepositoryTwo employeeRepository;

    public void loadEmployees() {
        List<EmployeeDetails> employees = employeeRepository.getAllEmployees();
        employees.forEach(System.out::println);
    }

    public void loadEmployeesByCity(String city) {
        List<EmployeeDetails> employees = employeeRepository.getAllEmployeesByCity(city);
        employees.forEach(System.out::println);
    }

    public void loadEmployeesByCityAndAge(String city, int age) {
        List<EmployeeDetails> employees = employeeRepository.getAllEmployeesByCityAndAge(city, age);
        employees.forEach(System.out::println);
    }

    public void addNewEmployee() {
        int count = employeeRepository.addEmployee(100, "Klaus", 29, 500000, "Frankfurt", "Male", "Germany");
        System.out.println("No of records inserted: " + count);
    }

    public void deleteEmployee(int empId) {
        employeeRepository.deleteEmployee(empId);
    }
}
