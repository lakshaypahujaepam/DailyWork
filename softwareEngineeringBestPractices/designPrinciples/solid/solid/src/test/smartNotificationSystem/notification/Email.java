package com.lakshay.smartNotificationSystem.notification;

import com.lakshay.smartNotificationSystem.notificationtype.NotificationType;

public class Email implements Notification{
    @Override
    public void send(NotificationType notificationType) {
        System.out.println("sending Email :" + " : " + notificationType.getMessage());
    }
}