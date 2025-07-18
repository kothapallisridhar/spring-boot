package com.sri.paymentservice.controller;

import com.sri.paymentservice.dto.NetBankingInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @GetMapping("/options")
    public List<String> getAllPaymentOptions() {
         logger.info("Request for Payment Options");
        return List.of("UPI", "Net Banking", "Credit Card", "Debit Card");
    }

    @PostMapping("/netbanking")
    public String netBanking(@RequestBody NetBankingInfo netBankingInfo) {
        logger.info("Request for Net Banking Payment");
        return "Payment Success";
    }
}
