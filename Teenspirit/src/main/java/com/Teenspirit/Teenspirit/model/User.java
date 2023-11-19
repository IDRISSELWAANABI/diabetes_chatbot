package com.Teenspirit.Teenspirit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    // Initialize field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password; // Store the hashed password not the actual password !!!!!!!!!!

    // No-args Constructor for JPA
    public User()
    {}

    // Constructor
    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters for the fields:
    public Long getId()
    {
        return this.id;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getEmail()
    {
        return this.email;
    }

    // Verify if a given password is actually a user's password
    public boolean verifyPassword()
    {
        // Hash and compare with the stored password:
        return true;
    }

}
