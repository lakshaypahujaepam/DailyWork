package com.lakshay.smartNotificationSystem.notificationtype;

public class AppointmentConfirmed implements NotificationType{
    @Override
    public String getMessage() {
        return "Appointment Confirmed";
    }
}
