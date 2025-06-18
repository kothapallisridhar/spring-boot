package com.sri.userservice.repository;

import com.sri.userservice.entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInformation, String> {
}
