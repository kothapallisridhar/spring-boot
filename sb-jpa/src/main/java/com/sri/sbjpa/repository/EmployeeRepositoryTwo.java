package com.sri.sbjpa.repository;

import com.sri.sbjpa.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepositoryTwo extends JpaRepository<EmployeeDetails, Integer> {

   @Query(value="SELECT * FROM emp_details", nativeQuery = true)
   List<EmployeeDetails> getAllEmployees();

   @Query(value="SELECT * FROM emp_details WHERE CITY = ?1", nativeQuery = true)
   List<EmployeeDetails> getAllEmployeesByCity(String city);

}
