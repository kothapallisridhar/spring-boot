package com.sri.userservice.controller;

import com.sri.userservice.service.UserService;
import com.sri.userservice.entity.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public String createUser(@RequestBody UserInformation userInformation) {
        return userService.createUser(userInformation);
    }

    @GetMapping("/{emailId}")
    public UserInformation getUserInfo(@PathVariable String emailId) {
        return userService.getUserInfo(emailId);
    }
}
