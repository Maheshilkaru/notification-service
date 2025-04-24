package org.iit.cc.notification.controller;

import jakarta.validation.Valid;
import org.iit.cc.notification.model.Notification;
import org.iit.cc.notification.service.NotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(
        @RequestHeader("X-Auth-Token") String token,
        @Valid @RequestBody Notification notification) {

        if (!"moontracker123".equals(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.send(notification));
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}