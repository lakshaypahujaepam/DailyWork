package com.lakshay.notification;

public class NotificationSender {
    public void send(NotificationStrategy notificationStrategy, String message) {
        notificationStrategy.send(message);
        System.out.println("Sent Message");
    }
}