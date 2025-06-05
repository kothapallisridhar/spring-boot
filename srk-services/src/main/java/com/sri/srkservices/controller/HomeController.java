package com.sri.srkservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // Req: Welcome to REST Services by SRK
    @ResponseBody
    @RequestMapping(path = "/welcome", method = RequestMethod.GET)
    public String sendWelcomeMessage() {
        return "Welcome to REST services by SRK services";
    }

    // REST end point
    @ResponseBody
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sendHello() {
        return "Hello";
    }
}
