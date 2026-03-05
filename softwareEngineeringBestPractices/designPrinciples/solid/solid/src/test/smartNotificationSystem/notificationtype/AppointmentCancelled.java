package com.lakshay.smartNotificationSystem.notificationtype;

public class AppointmentCancelled implements NotificationType{
    @Override
    public String getMessage() {
        return "Appointment Cancelled";
    }
}