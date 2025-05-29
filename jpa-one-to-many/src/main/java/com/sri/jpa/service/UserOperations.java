package com.sri.jpa.service;

import com.sri.jpa.entity.Address;
import com.sri.jpa.entity.UserDetails;
import com.sri.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserOperations {
    @Autowired
    UserRepository userRepository;
    // adding user
    public void addUser() {
        System.out.println("Adding user information");
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1122L);
        userDetails.setName("Sridhar");
        userDetails.setGender("Male");
        // address 1
        Address address1 = new Address(1, "Bangalore", 605566, "India");
        Address address2 = new Address(2, "Munich", 65566, "Germany");
        Address address3 = new Address(3, "Sanfrancisco", 305566, "USA");
        userDetails.setAddresses(List.of(address1, address2, address3));

        userRepository.save(userDetails);
    }
}
