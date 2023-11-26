package com.Teenspirit.Teenspirit.service;

import com.Teenspirit.Teenspirit.Dto.userRegistrationDto;
import com.Teenspirit.Teenspirit.model.User;
import com.Teenspirit.Teenspirit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(userRegistrationDto registrationDto)
    {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword());
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("The username's not found.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), null);
    }


  /*  public User getUserById(Long id)
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

   */
}
