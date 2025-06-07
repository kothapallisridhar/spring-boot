package com.sri.restservices.service;

import org.springframework.stereotype.Service;

@Service
public class UserManagementService {

    public String addUser() {
        return "User added successfully";
    }

    public String updatePassword() {
        return "Password updated successfully";
    }
}
