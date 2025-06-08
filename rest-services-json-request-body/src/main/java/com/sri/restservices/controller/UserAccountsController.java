package com.sri.restservices.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserAccountsController {

    // HTTP method: Create: POST
    @PostMapping(path = "/signup")
    public String userSignup() {
        return null;
    }

}
