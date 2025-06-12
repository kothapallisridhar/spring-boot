package com.sri.restservices.controller;

import com.sri.restservices.request.UserDetailsRequest;
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

    @PostMapping(path = "/user/create", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String createUser(@RequestBody UserDetailsRequest userDeatilsRequest) {

        // pass this info to service layer
        String result = userService.createUser(userDeatilsRequest);
        return result;
    }
}
