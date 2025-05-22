package com.sri.springbootjpa.operations;

import com.sri.springbootjpa.entity.ProductDetails;
import com.sri.springbootjpa.entity.UserInformation;
import com.sri.springbootjpa.repository.ProductDetailsRepository;
import com.sri.springbootjpa.repository.UserInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseOperations {
    @Autowired
    ProductDetailsRepository productDetailsRepository;
    @Autowired
    UserInformationRepository userInformationRepository;
    // insert product details into product table
    // 200, MacBook Pro, 200000
    // create entity object
    ProductDetails p1 = new ProductDetails(200, "MacBook Pro", 200000);
    ProductDetails p2 = new ProductDetails(300, "Canon EOS Mark2", 600000);
    public void addProductInformation() {
        productDetailsRepository.save(p2);
    }

    UserInformation user = new UserInformation(100, "Sridhar", "999888777369");
    public void addUserInformation() {
        userInformationRepository.save(user);
    }


}
