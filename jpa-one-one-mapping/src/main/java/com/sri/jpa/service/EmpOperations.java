package com.sri.jpa.service;

import com.sri.jpa.entity.Address;
import com.sri.jpa.entity.Employee;
import com.sri.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpOperations {
    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee() {
        Address address = new Address();
        address.setCity("Hyderabad");
        address.setPincode(555666);
        address.setCountry("India");

        Employee employee = new Employee();
        employee.setName("Rakesh");
        employee.setGender("Male");
        employee.setAddress(address);

        employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
