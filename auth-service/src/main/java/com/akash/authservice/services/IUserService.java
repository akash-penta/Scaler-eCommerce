package com.akash.authservice.services;

import com.akash.authservice.dtos.UserAddRequestDto;
import com.akash.authservice.dtos.UserAddResponseDto;
import com.akash.authservice.models.User;

import java.util.List;

public interface IUserService {
    public User getUser(int id) throws Exception;
    public List<User> getAllUser();
    public UserAddResponseDto addUser(UserAddRequestDto user) throws Exception;
}
