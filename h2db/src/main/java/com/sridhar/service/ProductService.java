package com.sridhar.service;

import com.sridhar.entity.Product;
import com.sridhar.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void saveProduct() {

        Product p = new Product();
        p.setProductName("Mouse");
        p.setProductPrice(8000.0);

        productRepo.save(p);

        System.out.println("Product saved successfully");

    }

}
