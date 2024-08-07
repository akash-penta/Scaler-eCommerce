package com.akash.authservice.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UserAddResponseDto {
    private String username;
    @JsonProperty( value = "is_active")
    private Boolean isActive;
    private Set<String> roles;

    public UserAddResponseDto() {
        roles = new HashSet<>();
    }
}
