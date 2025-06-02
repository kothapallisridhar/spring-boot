package com.sri.service;

import com.sri.entity.UserDetails;
import com.sri.repository.UserManagementRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserManagementService {

    @Autowired
    public UserManagementRepository userManagementRepository;

    public String userSignUp(String name, String email, String password) {
        System.out.println("Serive layer: Received details from Controller SignUp: " + name + ", " + email + ", " + password   );
        // send it to repository: JPA
        // already email existed or not
        // if existed, user already existed, no save operation
        // if not existed, then save operation

        Optional<UserDetails> user = userManagementRepository.findById(email);
        if(user.isPresent()) {
            return "User already existed, please try with new email";
        } else {
            UserDetails userDetails = new UserDetails();
            userDetails.setEmailId(email);
            userDetails.setPassword(password);
            userDetails.setFullName(name);
            userManagementRepository.save(userDetails);

            return "User created successfully";
        }
    }
    // verify user credentials with repository
    public String userLogin(String email, String psw) {

        UserDetails userDetails = userManagementRepository.findByEmailIdAndPassword(email, psw);
        if(userDetails != null) {
            return "Welcome to Instagram, " + userDetails.getFullName();
        } else {
            return "Invalid Credentials, Please try again.";
        }

    }

}
