package org.iit.cc.notification.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class Notification {

    private String id;
    private String recipient;
    private String message;
    private LocalDateTime sentAt;
}
