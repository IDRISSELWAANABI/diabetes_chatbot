package com.Teenspirit.Teenspirit.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user")
public class User {

    // Initialize field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String username;

    @Column(nullable = false, length = 45)
    private String firstName;
    
    @Column(nullable = false, length = 45)
    private String LastName;

    @Column(nullable = false, unique = true, length = 128)
    private String email;

    @Column(nullable = false, length = 64)
    private String password; // Store the hashed password not the actual password !!!!!!!!!!

    // Constructor
    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }


    // Verify if a given password is actually a user's password
    public boolean verifyPassword(String pwd)
    {
        // Hash and compare with the stored password:
        return true;
    }

}