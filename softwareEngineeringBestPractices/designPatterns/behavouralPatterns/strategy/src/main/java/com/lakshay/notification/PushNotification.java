package com.lakshay.notification;

public class PushNotification implements NotificationStrategy{
    @Override
    public void send(String message) {
        System.out.println("Push Notification : " + message);
    }
}