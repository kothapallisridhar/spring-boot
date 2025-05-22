package com.sri.springbootjpa.repository;

import com.sri.springbootjpa.entity.ProductDetails;
import com.sri.springbootjpa.entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInformationRepository extends JpaRepository<UserInformation, Integer> {
}
