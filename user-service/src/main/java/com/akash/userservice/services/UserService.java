package com.akash.userservice.services;

import com.akash.userservice.dtos.UserDto;
import com.akash.userservice.dtos.UserRegistrationDto;
import com.akash.userservice.dtos.UserUpdateDto;
import com.akash.userservice.models.User;
import com.akash.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDto registerUser(UserRegistrationDto userRegistrationDTO) {
        User user = new User();
        user.setEmail(userRegistrationDTO.getEmail());
        user.setName(userRegistrationDTO.getName());
        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
        User savedUser = userRepository.save(user);
        return new UserDto(savedUser.getId(), savedUser.getEmail(), savedUser.getName());
    }

    public Optional<UserDto> getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(user -> new UserDto(user.getId(), user.getEmail(), user.getName()));
    }

    public Optional<UserDto> getUserById(Long id) {
        return userRepository.findById(id)
                .map(user -> new UserDto(user.getId(), user.getEmail(), user.getName()));
    }

    public Optional<UserDto> updateUser(Long id, UserUpdateDto userUpdateDTO) {
        return userRepository.findById(id).map(existingUser -> {
            existingUser.setName(userUpdateDTO.getName());
            existingUser.setEmail(userUpdateDTO.getEmail());
            if (userUpdateDTO.getPassword() != null && !userUpdateDTO.getPassword().isEmpty()) {
                existingUser.setPassword(passwordEncoder.encode(userUpdateDTO.getPassword()));
            }
            User updatedUser = userRepository.save(existingUser);
            return new UserDto(updatedUser.getId(), updatedUser.getEmail(), updatedUser.getName());
        });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
