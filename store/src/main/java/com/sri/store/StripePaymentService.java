package com.sri.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiurl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enebled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("API URL: " + apiUrl);
        System.out.println("ENEBLED: " + enebled);
        System.out.println("TIMEOUT: " + timeout);
        System.out.println("SUPPORTED CURRENCIES: " + supportedCurrencies);
        System.out.println("Amount: " + amount);
    }
}
