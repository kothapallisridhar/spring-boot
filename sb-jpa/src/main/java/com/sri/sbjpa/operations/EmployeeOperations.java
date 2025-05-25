package com.sri.sbjpa.operations;

import com.sri.sbjpa.entity.EmployeeDetails;
import com.sri.sbjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
        employees.add(new EmployeeDetails(12,"One", 34, 500000, "Berlin", "Male", "Germany"));
        employees.add(new EmployeeDetails(22,"Two", 25, 1500000, "Berlin", "Male", "Germany"));
        employees.add(new EmployeeDetails(34,"Three", 30, 300000, "Frankfurt", "Male", "Germany"));
        employees.add(new EmployeeDetails(46,"Jane", 24, 500000, "Bangalore", "Female", "India"));
        employees.add(new EmployeeDetails(55,"Lene", 36, 500000, "Delhi", "Female", "India"));
        employees.add(new EmployeeDetails(68,"Rene", 28, 200000, "Chennai", "Male", "India"));
        employees.add(new EmployeeDetails(79,"Klaus", 23, 300000, "Texas", "Male", "USA"));
        employees.add(new EmployeeDetails(88,"Deiter", 33, 100000, "Detroit", "Male", "USA"));
        employees.add(new EmployeeDetails(96,"Bill", 45, 300000, "Mumbai", "Male", "India"));
        employees.add(new EmployeeDetails(15,"Van", 27, 200000, "Bangalore", "Female", "India"));

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

    public void getEmployeesByGender(String gender) {
        List<EmployeeDetails> employees = employeeRepository.findByGender(gender);
        System.out.println("Employees by gender");
        employees.forEach(System.out::println);
    }

    public void getEmployeesByGenderAndCountry(String gender, String country) {
        List<EmployeeDetails> employees = employeeRepository.findByGenderAndCountry(gender, country);
        System.out.println("Employees by gender and country");
        employees.forEach(System.out::println);
    }

    public void getEmployeesByGenderAndCityAndCountry(String gender, String city, String country) {
        List<EmployeeDetails> employees = employeeRepository.findByGenderAndCityAndCountry(gender, city, country);
        System.out.println("Employees by gender, city and country");
        employees.forEach(System.out::println);
    }

    public void getEmployeesByGenderOrCity(String gender, String city) {
        List<EmployeeDetails> employees = employeeRepository.findByGenderOrCity(gender, city);
        System.out.println("Employees by gender and city");
        employees.forEach(System.out::println);
    }

    public void loadAllEmployeesByEidAsc() {
        List<EmployeeDetails> allEmployees = employeeRepository.findAll(Sort.by("empId"));
        allEmployees.forEach(System.out::println);
    }

    public void loadAllEmployeesByEidDesc() {
        List<EmployeeDetails> allEmployees = employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "empId"));
        allEmployees.forEach(System.out::println);
    }

    public void loadAllEmployeesByCityNameAsc() {
        List<EmployeeDetails> allEmployees = employeeRepository.findAll(Sort.by("city"));
        allEmployees.forEach(System.out::println);
    }

}
