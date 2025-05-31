package com.sri.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usr_dtl")
public class UserDetails {
    @Id
    private String emailId;
    private String password;
    private String fullName;
}
