package com.sri.restservices.controller;

import com.sri.restservices.request.UserSignupRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserAccountsController {


    // HTTP method: Create: POST
    @PostMapping(path = "/signup")
    public String userSignup(@RequestBody UserSignupRequest userSignupRequest) {
        System.out.println("User signup request: " + userSignupRequest);
        return "User Signup Success";
    }
}
