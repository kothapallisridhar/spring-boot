package com.sri.jpa;

import com.sri.jpa.service.UserOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaOneToManyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(JpaOneToManyApplication.class, args);
        UserOperations userOps = container.getBean(UserOperations.class);
        userOps.addUser();

    }

}
