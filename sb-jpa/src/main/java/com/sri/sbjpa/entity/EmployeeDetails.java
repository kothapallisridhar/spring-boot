package com.sri.sbjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emp_details")
public class EmployeeDetails {
    @Id
    @Column(name="emp_id")
    private int empId;
    // note: db column name is same as entity property name, then we can ignore column annotation here
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="salary")
    private double salary;
    @Column(name="city")
    private String city;
    @Column(name="gender")
    private String gender;
    @Column(name="country")
    private String country;
}
