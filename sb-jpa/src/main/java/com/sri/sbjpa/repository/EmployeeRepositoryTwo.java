package com.sri.sbjpa.repository;

import com.sri.sbjpa.entity.EmployeeDetails;
import org.hibernate.type.descriptor.sql.internal.Scale6IntervalSecondDdlType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepositoryTwo extends JpaRepository<EmployeeDetails, Integer> {

   @Query(value="SELECT * FROM emp_details", nativeQuery = true)
   List<EmployeeDetails> getAllEmployees();

   @Query(value="SELECT * FROM emp_details WHERE CITY = ?1", nativeQuery = true)
   List<EmployeeDetails> getAllEmployeesByCity(String city);

   @Query(value="SELECT * FROM emp_details WHERE city = :city AND age = :age", nativeQuery = true)
   List<EmployeeDetails> getAllEmployeesByCityAndAge(@Param("city") String city, @Param("age") Integer age);

   @Transactional
   @Modifying
   @Query(value = "INSERT INTO emp_details values(?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
   public int addEmployee(int empId, String name, int age, double salary, String city, String gender, String country);

   @Transactional
   @Modifying
   @Query(value = "DELETE FROM emp_details WHERE emp_id=?1", nativeQuery = true)
   public void deleteEmployee(int empId);

}
