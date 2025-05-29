package com.sri.jpa.service;

import com.sri.jpa.entity.Department;
import com.sri.jpa.entity.Employee;
import com.sri.jpa.repository.DepartmentRepository;
import com.sri.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManagement {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    // add new employee
    public void addEmployee() {
        Department dept1 = new Department(1, "HR");
        departmentRepository.save(dept1);
        Department dept2 = new Department(2, "DEV");
        departmentRepository.save(dept2);
        Employee emp1 = new Employee(111, "Dilip", "Male", dept1);
        employeeRepository.save(emp1);
        Employee emp2 = new Employee(112, "Srini", "Male", dept1);
        employeeRepository.save(emp2);
        Employee emp3 = new Employee(113, "Alice", "Female", dept2);
        employeeRepository.save(emp3);


    }
}
