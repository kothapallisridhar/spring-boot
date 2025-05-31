package com.sri.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

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

        return "message";
    }


}
