package com.sri.sbjpa.repository;

import com.sri.sbjpa.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

    List<EmployeeDetails> findByCity(String citytName);
    List<EmployeeDetails> findByGender(String gender);
    List<EmployeeDetails> findByCountry(String country);
}
