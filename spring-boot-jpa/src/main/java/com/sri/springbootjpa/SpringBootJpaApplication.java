package com.sri.springbootjpa;

import com.sri.springbootjpa.operations.DatabaseOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaApplication.class, args);
        DatabaseOperations dbOperations = container.getBean(DatabaseOperations.class);
        //dbOperations.addProductInformation();
        dbOperations.addUserInformation();
    }

}
