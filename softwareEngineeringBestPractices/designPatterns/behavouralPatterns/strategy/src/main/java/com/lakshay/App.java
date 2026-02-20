package com.lakshay;

import com.lakshay.notification.NotificationSender;
import com.lakshay.notification.NotificationStrategy;
import com.lakshay.notification.PushNotification;

public class App {
    public static void main(String[] args) {
        NotificationSender notificationSender = new NotificationSender();
        notificationSender.send(new PushNotification(), "hello, I am Lakshay");
    }
}