package com.sri.sbjpa.operations;

import com.sri.sbjpa.entity.EmployeeDetails;
import com.sri.sbjpa.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeOperationsTwo {
    @Autowired
    EmployeeRepository employeeRepository;
    // delete by emp_id
    public void deleteEmployeeById(int empId) {
        employeeRepository.deleteById(empId);
    }
    @Transactional
    public void deleteByCountry(String country) {
        int countOfDeleted = employeeRepository.deleteByCountry(country);
        System.out.println("No. of deleted records by country: " + countOfDeleted);
    }

    public void updateEmployeeSalaryByEmployeeId(int empId, double salary) {
        EmployeeDetails emp = new EmployeeDetails(3, "Ronaldo", 40, 600000, "Rio", "Male", "Brazil");
        employeeRepository.save(emp);
    }

}
