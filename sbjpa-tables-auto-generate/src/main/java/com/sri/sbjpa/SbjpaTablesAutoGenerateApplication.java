package com.sri.sbjpa;

import com.sri.sbjpa.operations.OrderOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbjpaTablesAutoGenerateApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SbjpaTablesAutoGenerateApplication.class, args);
        OrderOperations orderOperations = container.getBean(OrderOperations.class);
        orderOperations.loadAllOrders();
    }

}
