package com.Teenspirit.Teenspirit.service;

import com.Teenspirit.Teenspirit.Dto.userRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void saveUser(userRegistrationDto registrationDto);
}
