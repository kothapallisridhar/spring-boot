package com.sri.store.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificatoinService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
