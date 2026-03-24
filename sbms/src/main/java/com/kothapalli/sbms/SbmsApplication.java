package com.kothapalli.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbmsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SbmsApplication.class, args);
        System.out.println("Total beans: " + context.getBeanDefinitionCount());

    }

}
