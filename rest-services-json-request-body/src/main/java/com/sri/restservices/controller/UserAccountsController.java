package com.sri.restservices.controller;

import com.sri.restservices.request.AddressRequest;
import com.sri.restservices.request.UserSignupRequest;
import com.sri.restservices.service.UserAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/user")
public class UserAccountsController {

    @Autowired
    private UserAccountsService userAccountsService;

    // HTTP method: Create: POST
    @PostMapping(path = "/signup", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String userSignup(@RequestBody UserSignupRequest userSignupRequest) {
        System.out.println("User signup request: " + userSignupRequest);
        String result = userAccountsService.userSignUp(userSignupRequest);
        return "User Signup Success";
    }

    // 2nd rest service : Create: POST
    @PostMapping("/address")
    public String addAddress(@RequestBody AddressRequest addressRequest) {

        // service
        System.out.println("User address request: " + addressRequest);
        return "Address added successfully";
    }
}
