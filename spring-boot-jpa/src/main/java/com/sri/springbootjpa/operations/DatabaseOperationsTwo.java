package com.sri.springbootjpa.operations;

import com.sri.springbootjpa.entity.ProductDetails;
import com.sri.springbootjpa.entity.UserInformation;
import com.sri.springbootjpa.repository.ProductDetailsRepository;
import com.sri.springbootjpa.repository.UserInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

@Component
public class DatabaseOperationsTwo {
    @Autowired
    ProductDetailsRepository productDetailsRepository;
    // add more products, inserting more than one record.
    public void addMoreProducts() {
        // ArrayList
        List<ProductDetails> allProducts = new ArrayList<>();
        allProducts.add(new ProductDetails(111, "Sony TV", 200000));
        allProducts.add(new ProductDetails(222, "Samsung TV", 150000));
        allProducts.add(new ProductDetails(333, "Bose Audio System", 300000));
        productDetailsRepository.saveAll(allProducts);
    }

    // all products information
    // sql: select * from product;
    public void loadAllProducts() {
        System.out.println("No. of products: " + productDetailsRepository.count());
        List<ProductDetails> allProducts = productDetailsRepository.findAll();
        System.out.println(allProducts);
    }


}
