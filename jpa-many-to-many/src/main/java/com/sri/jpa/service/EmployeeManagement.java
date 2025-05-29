package com.sri.jpa.service;

import com.sri.jpa.entity.Employee;
import com.sri.jpa.entity.Roles;
import com.sri.jpa.repository.EmployeeRepository;
import com.sri.jpa.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeManagement {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    RolesRepository rolesRepository;

    public void addEmployee() {
        Roles role1 = new Roles(1, "DEV");
        Roles role2 = new Roles(2, "LEAD");
        Roles role3 = new Roles(3, "PANEL");

        rolesRepository.save(role1);
        rolesRepository.save(role2);
        rolesRepository.save(role3);

        //Employee emp1 = new Employee(1, "Dilip", "Male", List.of(role1, role2, role3));
        Employee emp2 = new Employee(2, "Srini", "Male", List.of(role1, role2));
        employeeRepository.save(emp2);

    }
}
