package org.iit.cc.notification.model;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class Notification {
    private String id;

    @NotBlank(message = "Agent code is required")
    private String agentCode;

    @NotBlank(message = "Message is required")
    private String message;

    private String type;
    private LocalDateTime sentAt;

    // Getters and setters...
}