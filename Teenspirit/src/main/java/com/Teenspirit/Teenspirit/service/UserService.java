/* package com.Teenspirit.Teenspirit.service;

import com.Teenspirit.Teenspirit.model.User;
import com.Teenspirit.Teenspirit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public User getUserById(Long id)
    {
        return userRepository.findById(id).orElse(null);
    }

    public User getUserByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    public User getUserByEmail(String email)
    {
        return userRepository.findByEmail(email);
    }
}
*/