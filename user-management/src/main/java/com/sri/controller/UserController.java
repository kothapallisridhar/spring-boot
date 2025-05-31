package com.sri.controller;

import com.sri.service.UserManagementService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    public UserManagementService userManagementService;

    // Loading Signup form
    @RequestMapping(method = RequestMethod.GET, path = "/signup")
    public String loadSignupForm() {
        return "user_register";
    }

    // for signup request mapping
    @RequestMapping(method = RequestMethod.POST, path="/account/signup")
    public String userSignup(HttpServletRequest request) {
        String name = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("psw");
        System.out.println("Received details for signup: " + name + ", " + email + ", " + password)   ;

        // service layer
        userManagementService.userSignUp(name, email, password);
        return "message";
    }


}
