package com.lakshay.notification;

public class SMSStrategy implements NotificationStrategy{

    private String phone;

    @Override
    public void send(String message) {
        System.out.println("SMS ,message : " + message);
    }
}