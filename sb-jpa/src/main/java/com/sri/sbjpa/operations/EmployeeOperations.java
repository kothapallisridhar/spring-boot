package com.sri.sbjpa.operations;

import com.sri.sbjpa.entity.EmployeeDetails;
import com.sri.sbjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeOperations {
    @Autowired
    EmployeeRepository employeeRepository;

    public void addMoreEmployees() {
        List<EmployeeDetails> employees = new ArrayList<>();
        employees.add(new EmployeeDetails(1,"Sridhar", 44, 500000, "Munich", "Male", "Germany"));
        employees.add(new EmployeeDetails(2,"Suhas", 15, 1500000, "Munich", "Male", "Germany"));
        employees.add(new EmployeeDetails(3,"Jyothi", 40, 300000, "Munich", "Male", "Germany"));
        employees.add(new EmployeeDetails(4,"Jane", 20, 500000, "Bangalore", "Female", "India"));
        employees.add(new EmployeeDetails(5,"Lene", 30, 500000, "Hyderabad", "Female", "India"));
        employees.add(new EmployeeDetails(6,"Rene", 28, 200000, "Chennai", "Male", "India"));
        employees.add(new EmployeeDetails(7,"Klaus", 23, 300000, "Texas", "Male", "USA"));
        employees.add(new EmployeeDetails(8,"Deiter", 33, 100000, "Detroit", "Male", "USA"));
        employees.add(new EmployeeDetails(9,"Bill", 45, 300000, "Hyderabad", "Male", "India"));
        employees.add(new EmployeeDetails(10,"Van", 27, 200000, "Bangalore", "Female", "India"));

        employeeRepository.saveAll(employees);
    }

    // get employee data by emp_id
    public void loadEmployeeInformationByEmpId(int id) {
        Optional<EmployeeDetails> empObj = employeeRepository.findById(id);

        if(empObj.isPresent()) {
            EmployeeDetails emp = empObj.get();
            System.out.println("Emmployee: " + emp);
        } else {
            System.out.println("Employee not found");
        }

    }
    public void loadEmployeeInformation() {
        List<EmployeeDetails> allEmployees = employeeRepository.findAll();
        allEmployees.forEach(System.out::println);
    }

    public void getEmployeesByCity(String cityName) {
        List<EmployeeDetails> employees = employeeRepository.findByCity(cityName);
        System.out.println("Employees by city");
        employees.forEach(System.out::println);
    }

}
