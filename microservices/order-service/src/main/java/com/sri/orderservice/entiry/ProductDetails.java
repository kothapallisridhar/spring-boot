package com.sri.orderservice.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "amazon_order_info")
public class ProductDetails {

    private Integer productId;
    private String productName;
    private double price;
}
