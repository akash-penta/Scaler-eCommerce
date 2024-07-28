package com.akash.notificationservice.models;

import lombok.Data;

@Data
public class EnabledChannels {
    private boolean email;
    private boolean sms;
    private boolean inApp;
}
