package com.example.first.service;

import com.example.first.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto createUser(UserDto user);
}
