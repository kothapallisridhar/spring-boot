package com.sri.springbootjpa;

import com.sri.springbootjpa.operations.DatabaseOperations;
import com.sri.springbootjpa.operations.DatabaseOperationsTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaApplication.class, args);
        DatabaseOperations dbOperations = container.getBean(DatabaseOperations.class);
        //dbOperations.addProductInformation();
        //dbOperations.addUserInformation();
        DatabaseOperationsTwo dbOperations2 = container.getBean(DatabaseOperationsTwo.class);
        //dbOperations2.addMoreProducts();
        dbOperations2.loadAllProducts();

    }

}
