package com.sri.restservices.controller;

import com.sri.restservices.request.UserDetailsRequest;
import com.sri.restservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // integrate service layer
    @Autowired
    public UserService userService;

    @PostMapping("/user/create")
    public String createUser(@RequestBody UserDetailsRequest userDeatilsRequest) {

        // pass this info to service layer
        String result = userService.createUser(userDeatilsRequest);
        return result;
    }
}
