package com.sri.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SbAppApplication.class, args);
        System.out.println("Bean Definition Count: " + context.getBeanDefinitionCount());
    }

}
