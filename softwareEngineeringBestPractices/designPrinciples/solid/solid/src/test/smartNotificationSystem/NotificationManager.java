package com.lakshay.smartNotificationSystem;

import com.lakshay.smartNotificationSystem.notification.Notification;
import com.lakshay.smartNotificationSystem.notificationtype.NotificationType;

public class NotificationManager {
    private Notification notification;

    public NotificationManager(Notification notification) {
        this.notification = notification;
    }

    public void notify(NotificationType type) {
        notification.send(type);
    }
}