package com.sri.restservices.request;

import lombok.Data;

@Data
public class UserSignupRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;
    private int age;
}
