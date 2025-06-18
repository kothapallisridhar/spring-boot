package com.sri.orderservice.controller;

import com.sri.orderservice.dto.OrderInformation;
import com.sri.orderservice.entiry.ProductDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OrderController {

    @PostMapping("/create")
    public String createOrder(@RequestBody OrderInformation orderInformation) {
        System.out.println("Order creation request for user" + orderInformation);

        // 8 digit number
        return "Order created. Order Reference: " + UUID.randomUUID();
    }

    @GetMapping("/info/{orderId}")
    public OrderInformation createOrder(@PathVariable String orderId) {
        System.out.println("Order information for Order Id: " + orderId);

        // 8 digit number
        return new OrderInformation("srk@gmail.com", List.of(new ProductDetails(1,"iPhone", 100000), new ProductDetails(2,"MacBook", 200000)) , 300000 );
    }
}
