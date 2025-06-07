package com.sri.restservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {
    // REST Service
    // an end point shold allow all HTTP methods if they don't define HTTP method in request mapping
    // value = path
    @RequestMapping(value = "/info")
    public String getInfo() {
        return "SRK IT";
    }

    @RequestMapping(path = "/contact", method = {RequestMethod.GET, RequestMethod.PUT})
    public String getContactDetails() {
        return "email: srk@gmail.com";
    }
}
