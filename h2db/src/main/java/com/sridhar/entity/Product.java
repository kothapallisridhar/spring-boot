package com.sridhar.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private Double productPrice;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate createdDate;

    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDate updatedDate;
}
