package com.sri.sbjpa.operations;

import com.sri.sbjpa.entity.OrderInformation;
import com.sri.sbjpa.repository.OrderInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderOperations {

    @Autowired
    OrderInformationRepository orderRepository;

    public void loadAllOrders() {
        List<OrderInformation> orders = orderRepository.findAll();
        orders.forEach(System.out::println);
    }

}
