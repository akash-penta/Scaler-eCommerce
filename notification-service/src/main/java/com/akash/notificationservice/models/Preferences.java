package com.akash.notificationservice.models;

import com.akash.notificationservice.enums.NotificationType;
import lombok.Data;

import java.util.UUID;

@Data
public class Preferences {
    private UUID userId;
    private NotificationType notificationType;
    private boolean email;
    private boolean sms;
    private boolean inApp;
}
