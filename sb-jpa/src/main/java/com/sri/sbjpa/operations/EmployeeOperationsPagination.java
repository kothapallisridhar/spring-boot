package com.sri.sbjpa.operations;

import com.sri.sbjpa.entity.EmployeeDetails;
import com.sri.sbjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeOperationsPagination {
    @Autowired
    EmployeeRepository employeeRepository;

    // per page: 3 records
    public void getEmpInformation() {
        Page<EmployeeDetails> pageObjects = employeeRepository.findAll(Pageable.ofSize(3)); // all records
        List<EmployeeDetails> employees = pageObjects.getContent();
        employees.forEach(System.out::println);
    }

    public void getEmpDetails(int pageNo, int recordsPerPage) {
        List<EmployeeDetails> employees = employeeRepository.findAll(PageRequest.of(pageNo, recordsPerPage, Sort.by("empId"))).getContent();
        employees.forEach(System.out::println);
    }

}
