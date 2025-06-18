package com.sri.userservice.service;

import com.sri.userservice.entity.UserInformation;
import com.sri.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(UserInformation userInformation) {
        userRepository.save(userInformation);
        return "User created successfully";

    }

    public UserInformation getUserInfo(String emailId) {
        return userRepository.findById(emailId).get();
    }
}
