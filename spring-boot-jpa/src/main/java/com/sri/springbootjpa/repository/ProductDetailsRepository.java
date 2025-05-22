package com.sri.springbootjpa.repository;

import com.sri.springbootjpa.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {
}
