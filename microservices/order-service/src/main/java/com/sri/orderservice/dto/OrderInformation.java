package com.sri.orderservice.dto;

import com.sri.orderservice.entiry.ProductDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInformation {

    private String emailId;
    private List<ProductDetails> productsInfo;
    private double totalAmount;
}
