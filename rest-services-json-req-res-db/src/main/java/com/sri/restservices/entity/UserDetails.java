package com.sri.restservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "swiggy_user_dtl")
public class UserDetails {
    @Id
    private String emailId;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String password;
    private int age;
}
