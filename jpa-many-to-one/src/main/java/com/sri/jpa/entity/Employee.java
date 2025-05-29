package com.sri.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_dtl")
public class Employee {
    @Id
    private int empId;
    private String name;
    private String gender;
    // many to one, N -> 1
    @ManyToOne
    Department department;
}
