package com.sri.sbjpa.repository;

import com.sri.sbjpa.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

    List<EmployeeDetails> findByCity(String citytName);
    List<EmployeeDetails> findByGender(String gender);
    List<EmployeeDetails> findByCountry(String country);
    List<EmployeeDetails> findByGenderAndCountry(String gender, String country);
    List<EmployeeDetails> findByGenderAndCityAndCountry(String gender, String city, String country);
    List<EmployeeDetails> findByGenderOrCity(String gender, String city);

    int deleteByCountry(String country);

}
