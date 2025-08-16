package com.sridhar;

import com.sridhar.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class H2dbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(H2dbApplication.class, args);
        ProductService productSvc = context.getBean(ProductService.class);
        productSvc.saveProduct();
    }

}
