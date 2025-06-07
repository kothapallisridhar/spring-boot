package com.sri.restservices.controller;

import com.sri.restservices.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {

    @Autowired
    public UserManagementService userManagementService;
    // add user
    @RequestMapping(path = "/add/user", method = RequestMethod.POST)
    public String addUser() {
        String result = userManagementService.addUser();
        return result;
    }
    // update user PUT
    @RequestMapping(path="/update/password", method = RequestMethod.PUT)
    public String updatePassword() {
        String result  = userManagementService.updatePassword();
        return result;

    }
    // delete user DELETE
    @RequestMapping(path = "/delete/profile", method = RequestMethod.DELETE)
    public String deleteProfile() {
        return "Profilie deleted";
    }

    // get user information GET
    @RequestMapping(path = "/get/profile", method = RequestMethod.GET)
    public String getProfileDetails() {
        return "Profilie details: Sridhar, Frankfurt, Germany";
    }

}
