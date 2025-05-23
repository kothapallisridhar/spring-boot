package com.sri.sbjpa.operations;

import com.sri.sbjpa.entity.EmployeeDetails;
import com.sri.sbjpa.repository.EmployeeRepository;
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

}
