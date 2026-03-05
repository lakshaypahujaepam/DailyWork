package com.lakshay.smartNotificationSystem.notificationtype;

public class PaymentSuccess implements NotificationType{
    @Override
    public String getMessage() {
        return "Payment Success";
    }
}