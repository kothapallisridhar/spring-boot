package com.sri.restservices.controller;

import com.sri.restservices.entity.UserDetails;
import com.sri.restservices.request.UserDetailsRequest;
import com.sri.restservices.request.UserLoginRequest;
import com.sri.restservices.response.UserDetailsResponse;
import com.sri.restservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // integrate service layer
    @Autowired
    public UserService userService;

    @PostMapping(path = "/user/create", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String createUser(@RequestBody UserDetailsRequest userDeatilsRequest) {

        // pass this info to service layer
        String result = userService.createUser(userDeatilsRequest);
        return result;
    }
    // User Login: CRUD : Read : Select * from users where email and password : GET
    @PostMapping(path = "/user/login")
    public UserDetailsResponse userLogin(@RequestBody UserLoginRequest userLoginRequest) {
        System.out.println("userLoginRequest: " + userLoginRequest);
        UserDetailsResponse response = userService.userLogin(userLoginRequest);
        return response;
    }
}
