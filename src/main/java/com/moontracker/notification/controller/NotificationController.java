package com.moontracker.notification.controller;

import com.moontracker.notification.model.Notification;
import com.moontracker.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@Valid @RequestBody Notification notification) {
        String result = notificationService.sendNotification(notification);
        return ResponseEntity.ok(result);
    }
}
