package com.sri.sbjpa;

import com.sri.sbjpa.service.OrderManagementService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbJpaGeneratedValuesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SbJpaGeneratedValuesApplication.class, args);
        OrderManagementService orderMgmtService = container.getBean(OrderManagementService.class);
        orderMgmtService.createOrder();
    }

}
