package com.kothapalli.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class RestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
        System.out.println("------------m1()-----------");
        m1();

        System.out.println("------------m2()-----------");
        m2();

        System.out.println("------------m3()-----------");
        m3();

    }

    public static void m2() {
        RestTemplate rt = new RestTemplate();
        String apiUrl = "https://dummyjson.com/quotes/random";
        ResponseEntity<Quote> forEntity = rt.getForEntity(apiUrl, Quote.class);

        int value = forEntity.getStatusCode().value();
        Quote body = forEntity.getBody();
        System.out.println(body);
    }

    public static void m1() {
        RestTemplate rt = new RestTemplate();

        String apiUrl = "https://dummyjson.com/quotes/random";

        ResponseEntity<String> forEntity = rt.getForEntity(apiUrl, String.class);
        int value = forEntity.getStatusCode().value();
        if(value == 200) {
            String body = forEntity.getBody();
            System.out.println(body);
        }
    }

    public static void m3() {
        RestTemplate rt = new RestTemplate();
        String apiUrl = "https://dummyjson.com/quotes";
        ResponseEntity<QuotesResponseDto> forEntity = rt.getForEntity(apiUrl, QuotesResponseDto.class);
        QuotesResponseDto body = forEntity.getBody();
        List<Quote> quotes = body.getQuotes();
        quotes.forEach(System.out::println);
    }

}
