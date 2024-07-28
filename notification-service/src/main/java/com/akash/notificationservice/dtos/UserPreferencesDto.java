package com.akash.notificationservice.dtos;

import com.akash.notificationservice.models.Preferences;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class UserPreferencesDto {
    private UUID userId;
    private List<Preferences> preferences;
}
