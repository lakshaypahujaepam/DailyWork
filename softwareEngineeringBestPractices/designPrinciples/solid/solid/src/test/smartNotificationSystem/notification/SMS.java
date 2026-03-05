package com.lakshay.smartNotificationSystem.notification;

import com.lakshay.smartNotificationSystem.notificationtype.NotificationType;

public class SMS implements Notification{
    @Override
    public void send(NotificationType notificationType) {
        System.out.println("sending SMS : " + " : " + notificationType.getMessage());
    }
}
