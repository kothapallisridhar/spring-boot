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
}
