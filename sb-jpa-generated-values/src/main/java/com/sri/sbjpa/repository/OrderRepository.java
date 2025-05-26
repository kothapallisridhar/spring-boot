package com.sri.sbjpa.repository;


import com.sri.sbjpa.entity.OrderInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderInformation, Long> {

}
