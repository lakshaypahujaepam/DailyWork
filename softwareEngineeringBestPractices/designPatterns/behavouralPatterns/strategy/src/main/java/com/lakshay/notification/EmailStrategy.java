package com.lakshay.notification;

public class EmailStrategy implements NotificationStrategy{

    private String email;

    @Override
    public void send(String message) {
        System.out.println("Email message : " + message);
    }
}
