package com.kothapalli.courseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        String message = "Sri Satchidananda Sadguru Sainath Maharaj Ki Jai!\nSadguru Sri Sainathuni Sarath Babuji Ki Jai!!";
        return message;
    }

}
