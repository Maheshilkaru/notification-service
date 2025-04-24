package com.moontracker.notification.service;

import com.moontracker.notification.model.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public String sendNotification(Notification notification) {
        System.out.printf("Sending %s to %s: %s%n", notification.getType(), notification.getRecipient(), notification.getMessage());
        return "Notification sent to " + notification.getRecipient();
    }
}
