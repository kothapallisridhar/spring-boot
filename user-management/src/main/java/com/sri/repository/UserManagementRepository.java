package com.sri.repository;

import com.sri.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagementRepository extends JpaRepository<UserDetails, String> {

}
