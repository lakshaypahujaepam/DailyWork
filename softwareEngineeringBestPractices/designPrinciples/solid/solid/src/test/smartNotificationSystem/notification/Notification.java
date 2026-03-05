package com.lakshay.smartNotificationSystem.notification;

import com.lakshay.smartNotificationSystem.notificationtype.NotificationType;

public interface Notification {
    void send(NotificationType notificationType);
}