package com.sri.restservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {
    // REST Service
    // an end point shold allow all HTTP methods if they don't define HTTP method in request mapping
    @RequestMapping(path = "/info")
    public String getInfo() {
        return "SRK IT";
    }
}
