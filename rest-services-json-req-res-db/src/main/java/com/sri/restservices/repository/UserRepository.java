package com.sri.restservices.repository;

import com.sri.restservices.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, String> {

    UserDetails findByEmailIdAndPassword(String emailId, String password);
}
