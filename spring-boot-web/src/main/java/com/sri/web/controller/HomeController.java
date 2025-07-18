package com.sri.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String sayWelcome() {
        System.out.println("Request received by Controller. Processing request...");
        return "welcome";
    }
}
