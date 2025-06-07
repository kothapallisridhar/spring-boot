package com.sri.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact") // common uri path
public class OrganizationController {
    // REST Service
    // an end point shold allow all HTTP methods if they don't define HTTP method in request mapping
    // value = path
    @RequestMapping(value = "/info")
    public String getInfo() {
        return "SRK IT";
    }

    @RequestMapping(path = "/email", method = {RequestMethod.GET, RequestMethod.PUT})
    public String getContactDetails() {
        return "email: srk@gmail.com";
    }
    // you can ignore path or value property name in case of only path is defined
    @RequestMapping("/address")
    public String getAddress() {
        return "Munich, Germany";
    }
    // shorthand way of using @RequestMapping
    //@RequestMapping(path = "/address", method = RequestMethod.GET)
    @GetMapping("/phonenumber")
    public String getPhoneNumber() {
        return "9900886699";
    }

    // similarly
    // GET : @GetMapping
    // POST : @PostMapping
    // PUT : @PutMapping
    // DELETE : @DeleteMapping


}
