package com.sri.springbootjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class ProductDetails {
    @Id
    @Column(name="pid")
    private int productId;
    @Column(name="pname")
    private String productName;
    @Column(name="price")
    private double productPrice;
}
