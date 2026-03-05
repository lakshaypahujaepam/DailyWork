package com.lakshay.smartNotificationSystem;

import com.lakshay.smartNotificationSystem.notification.Email;
import com.lakshay.smartNotificationSystem.notification.Notification;
import com.lakshay.smartNotificationSystem.notification.Push;
import com.lakshay.smartNotificationSystem.notificationtype.AppointmentConfirmed;
import com.lakshay.smartNotificationSystem.notificationtype.NotificationType;
import com.lakshay.smartNotificationSystem.notificationtype.PaymentSuccess;
import com.lakshay.smartNotificationSystem.user.Patient;
import com.lakshay.smartNotificationSystem.user.User;

public class LocalHospital {
    public static void main(String[] args) {
//        User user = new Patient("abc", "teleangana", "S+", "Critical");
//
//        Notification pushNotification = new Push();
//        pushNotification.send(new PaymentSuccess());
//        pushNotification.send(new AppointmentConfirmed());

        NotificationManager manager = new NotificationManager(new Email());
        manager.notify(new PaymentSuccess());
    }
}
