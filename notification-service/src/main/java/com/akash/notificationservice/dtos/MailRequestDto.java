package com.akash.notificationservice.dtos;

import lombok.Data;

@Data
public class MailRequestDto {
    private String to;
    private String cc;
    private String subject;
    private String body;
}
