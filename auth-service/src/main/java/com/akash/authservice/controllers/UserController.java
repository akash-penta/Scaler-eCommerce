package com.akash.authservice.controllers;

import com.akash.authservice.dtos.UserAddRequestDto;
import com.akash.authservice.dtos.UserAddResponseDto;
import com.akash.authservice.models.Role;
import com.akash.authservice.models.User;
import com.akash.authservice.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/"
    )
    public List<UserAddResponseDto> getAllUsers() {
        List<User> users = userService.getAllUser();
        List<UserAddResponseDto> userResponse = new ArrayList<>();

        for(User user : users) {
            UserAddResponseDto userAddResponseDto = new UserAddResponseDto();

            userAddResponseDto.setUsername(user.getUsername());
            userAddResponseDto.setIsActive(user.isActive());
            for (Role role : user.getRoles()) {
                userAddResponseDto.getRoles().add(role.getRole());
            }
            userResponse.add(userAddResponseDto);
        }

        return userResponse;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/{id}"
    )
    public UserAddResponseDto getUsers(@PathVariable int id) throws Exception {
        User user = userService.getUser(id);

        UserAddResponseDto userAddResponseDto = new UserAddResponseDto();

        userAddResponseDto.setUsername(user.getUsername());
        userAddResponseDto.setIsActive(user.isActive());
        for(Role role : user.getRoles()) {
            userAddResponseDto.getRoles().add(role.getRole());
        }

        return userAddResponseDto;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/signup"
    )
    public UserAddResponseDto addUser(@RequestBody UserAddRequestDto user) throws Exception {
        return userService.addUser(user);
    }
}
