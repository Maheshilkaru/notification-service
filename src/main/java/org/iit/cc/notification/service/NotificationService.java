package org.iit.cc.notification.service;

import org.iit.cc.notification.model.Notification;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationService {
    private final List<Notification> notifications = new ArrayList<>();

    public String send(Notification notification) {
        notification.setSentAt(LocalDateTime.now());
        notifications.add(notification);
        return "Notification sent successfully.";
    }

    public List<Notification> getAll() {
        return notifications;
    }
}