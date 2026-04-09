package com.kothapalli.webclient;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class QuoteService {

    private String RANDOM_QUOTE_URL = "https://dummyjson.com/quotes/random";

    public void getRandomQuote() {

        WebClient webClient = WebClient.create();
        System.out.println(webClient.getClass().getName());
        Mono<Quote> bodyToMono = webClient.get()
                .uri(RANDOM_QUOTE_URL)
                .retrieve()
                .bodyToMono(Quote.class);
        // Mono (single response & Flux (response is a stream)

        // making synchronous call using WebClient
        Quote q = bodyToMono.block();
        System.out.println(q);
    }

    public void getQuoteAsync() {
        WebClient webClient = WebClient.create();

        webClient.get()
                .uri(RANDOM_QUOTE_URL)
                .retrieve()
                .bodyToMono(Quote.class)
                .subscribe(response -> {
                    handleResponse(response);
                });
        System.out.println("Request sending completed............");
    }

    private void handleResponse(Quote response) {
        System.out.println(response);
    }
}
