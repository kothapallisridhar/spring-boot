package com.sri.store.notification;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificatoinService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
