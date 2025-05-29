package com.sri.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp_dtl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @SequenceGenerator(name="emp_id_seq", sequenceName = "emp_id_seq", initialValue = 1000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="emp_id_seq")
    private long empId;
    private String name;
    private String gender;
}
