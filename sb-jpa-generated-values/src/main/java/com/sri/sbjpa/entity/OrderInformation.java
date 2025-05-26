package com.sri.sbjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private String emailId;
    private String name;
    private double price;
    private LocalDateTime timeOfOrder;
}
