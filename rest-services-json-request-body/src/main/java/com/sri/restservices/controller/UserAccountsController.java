package com.sri.restservices.controller;

import com.sri.restservices.request.Address;
import com.sri.restservices.request.AddressRequest;
import com.sri.restservices.request.UserSignupRequest;
import com.sri.restservices.service.UserAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserAccountsController {

    @Autowired
    private UserAccountsService userAccountsService;

    // HTTP method: Create: POST
    @PostMapping(path = "/signup", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public String userSignup(@RequestBody UserSignupRequest userSignupRequest) {
        System.out.println("User signup request: " + userSignupRequest);
        String result = userAccountsService.userSignUp(userSignupRequest);
        return "User Signup Success";
    }

    // 2nd rest service : Create: POST
    @PostMapping("/address")
    public String addAddress(@RequestBody AddressRequest addressRequest) {

        // service
        System.out.println("User address request: " + addressRequest);
        return "Address added successfully";
    }

    @GetMapping(path = "/get/address", produces = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody
    public Address getAddress() {

        Address address = new Address();
        address.setArea("Bangalore");
        address.setCity("Bangalore");
        address.setCountry("India");
        address.setDistrict("Bangalore");
        address.setFlatDetails("1122/abc");
        address.setLandmark("Near Airport");
        address.setPincode("566066");
        address.setState("Karnataka");

        // returning response content
        return address;
    }
}
