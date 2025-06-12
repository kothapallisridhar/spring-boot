package com.sri.restservices.service;

import com.sri.restservices.entity.UserDetails;
import com.sri.restservices.repository.UserRepository;
import com.sri.restservices.request.UserDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // integrate repository layer
    @Autowired
    public UserRepository userRepository;


    public String createUser(UserDetailsRequest userDeatilsRequest) {

        // repository layer
        // pass entity object
        // data mapping / data transfer from one object to another object

        UserDetails userData = new UserDetails();
        userData.setEmailId(userDeatilsRequest.getEmailId());
        userData.setFirstName(userDeatilsRequest.getFirstName());
        userData.setLastName(userDeatilsRequest.getLastName());
        userData.setMobileNumber(userDeatilsRequest.getMobileNumber());
        userData.setPassword(userDeatilsRequest.getPassword());
        userData.setAge(userDeatilsRequest.getAge());

        if(userRepository.findById(userDeatilsRequest.getEmailId()).isEmpty()) {
            userRepository.save(userData);
            return "User Created successfully";
        }

        return "User already exists!";
    }
}
