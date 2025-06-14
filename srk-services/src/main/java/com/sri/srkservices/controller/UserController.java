package com.sri.srkservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // Not added @ResponseBody but internally added because of @RestController
    // REST Service
    @RequestMapping(path = "/add/user", method = RequestMethod.GET)
    public String addUser() {
        return "User added successfully";
    }

    @RequestMapping(path = "/delete/user", method = RequestMethod.GET)
    public String deleteUser() {
        return "User deleted successfully";
    }

}
