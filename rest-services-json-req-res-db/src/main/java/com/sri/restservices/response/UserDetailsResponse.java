package com.sri.restservices.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
public class UserDetailsResponse {

    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNumber;
    private int age;
}

