package com.akash.authservice.security.models;

import com.akash.authservice.models.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
@JsonSerialize(as = MyGrantedAuthority.class)
public class MyGrantedAuthority implements GrantedAuthority {
    private Role role;

    MyGrantedAuthority(Role role) {
        this.role = role;
    }
    @Override
    @JsonIgnore
    public String getAuthority() {
        return role.getRole();
    }
}
