package com.sri.jpa.service;

import com.sri.jpa.entity.Address;
import com.sri.jpa.entity.Employee;
import com.sri.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmpOperations {
    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee() {
        Address address = new Address();
        address.setCity("Chennai");
        address.setPincode(655666);
        address.setCountry("India");

        Employee employee = new Employee();
        employee.setName("Dinesh");
        employee.setGender("Male");
        employee.setAddress(address);

        employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    public void getEmployeeInfo(Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            Employee employee = optional.get();
            System.out.println(employee);
        }
    }
}
