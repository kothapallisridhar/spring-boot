package com.sri.introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Apple {
    public void eatApple() {
        System.out.println("Im eating apple");
    }

    @PostConstruct
    void callThisBeforeAppleCreated() {
        System.out.println("Apple object is going to be created");
    }

    @PreDestroy
    void callThisBeforeAppleDestroyed() {
        System.out.println("Apple object is going to be destroyed");
    }
}
