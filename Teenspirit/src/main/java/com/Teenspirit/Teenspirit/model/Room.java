package com.Teenspirit.Teenspirit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Long userId;

    // Constructor
    public Room(String title, Long userId) {
        this.title = title;
        this.userId = userId;
    }

    // No-args constructor
    public Room() {
    }

    // Getters for the fields:
    public Long getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    // Remove a room
    public void removeRoom()
    {
        // remove the room from the database
    }

    // Create a new room
    public Room createRoom(String title, Long userId)
    {
        return new Room(title, userId);
    }
}
