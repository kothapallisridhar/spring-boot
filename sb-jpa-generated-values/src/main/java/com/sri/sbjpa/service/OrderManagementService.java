package com.sri.sbjpa.service;

import com.sri.sbjpa.entity.OrderInformation;
import com.sri.sbjpa.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Component
public class OrderManagementService {
    @Autowired
    OrderRepository orderRepository;

    public void createOrder() {
        OrderInformation order = new OrderInformation();
        order.setEmailId("order@gmail.com");
        order.setName("Sridhar");
        order.setPrice(54555);
        order.setTimeOfOrder(LocalDateTime.now());

        OrderInformation createdOrder = orderRepository.save(order);
        System.out.println("Order created successfully");
        System.out.println("Order created: " + createdOrder);


    }


}
