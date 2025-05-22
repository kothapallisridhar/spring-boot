package com.sri.springbootjpa.operations;

import com.sri.springbootjpa.entity.ProductDetails;
import com.sri.springbootjpa.repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseOperations {
    @Autowired
    ProductDetailsRepository productDetailsRepository;
    // insert product details into product table
    // 200, MacBook Pro, 200000
    // create entity object
    ProductDetails p1 = new ProductDetails(200, "MacBook Pro", 200000);
    public void addProductInformation() {
        productDetailsRepository.save(p1);
    }
}
