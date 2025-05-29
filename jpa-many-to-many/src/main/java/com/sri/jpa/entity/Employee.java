package com.sri.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.util.List;

@Data
@Entity
@Table(name = "emp_dtl")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private int empId;
    private String name;
    private String gender;

    // many to many, N -> N
    @ManyToMany
    @JoinTable(name = "emp_roles_joining", joinColumns = @JoinColumn(name = "emp_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Roles> roles;
}
