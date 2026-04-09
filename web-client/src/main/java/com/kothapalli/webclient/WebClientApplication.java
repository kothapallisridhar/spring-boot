package com.kothapalli.webclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebClientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(WebClientApplication.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(WebClientApplication.class, args);
        QuoteService service = context.getBean(QuoteService.class);
        //service.getRandomQuote();
        service.getQuoteAsync();
    }

}
