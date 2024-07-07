package com.akash.authservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UserAddRequestDto {
    private String  username;
    private String  password;
    private Set<String> roles;
}