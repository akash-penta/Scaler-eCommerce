package com.akash.notificationservice.controllers;

import com.akash.notificationservice.dtos.MailRequestDto;
import com.akash.notificationservice.dtos.MailResponseDto;
import com.akash.notificationservice.dtos.UserPreferencesDto;
import com.akash.notificationservice.services.NotificationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/notify")
public class NotificationController {
    final private NotificationService notificationService;

    NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public MailResponseDto sendNotification(@RequestBody MailRequestDto mailRequestDto) {
        return notificationService.sendNotification(mailRequestDto);
    }


    @PutMapping("/preferences")
    public MailResponseDto setPreferences(@RequestBody UserPreferencesDto userPreferencesDto) {
        return notificationService.setPreferences(userPreferencesDto);
    }

}
