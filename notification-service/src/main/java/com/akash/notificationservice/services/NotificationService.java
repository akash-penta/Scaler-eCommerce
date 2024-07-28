package com.akash.notificationservice.services;

import com.akash.notificationservice.dtos.MailRequestDto;
import com.akash.notificationservice.dtos.MailResponseDto;
import com.akash.notificationservice.dtos.UserPreferencesDto;
import com.akash.notificationservice.services.utilities.EmailService;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public MailResponseDto sendNotification(MailRequestDto mailRequestDto) {
        emailService.sendMail(mailRequestDto.getTo(),
                mailRequestDto.getCc(),
                mailRequestDto.getSubject(),
                mailRequestDto.getBody()
        );
        MailResponseDto mailResponseDto = new MailResponseDto();
        mailResponseDto.setStatus("MAIL_SENT");
        return mailResponseDto;
    }

    public MailResponseDto setPreferences(UserPreferencesDto userPreferencesDto) {
        return new MailResponseDto("DONE");
    }
}
