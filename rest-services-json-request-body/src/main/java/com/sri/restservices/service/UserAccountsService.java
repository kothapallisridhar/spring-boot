package com.sri.restservices.service;

import com.sri.restservices.request.UserSignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountsService {
    // Repository

    public String userSignUp(UserSignupRequest userSignupRequest) {
        return "User sign up";
    }
}
