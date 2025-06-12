package com.sri.restservices.request;

import lombok.Data;

@Data
public class UserLoginRequest {

    private String emailId;
    private String password;
}
