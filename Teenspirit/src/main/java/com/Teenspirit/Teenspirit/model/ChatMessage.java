package com.Teenspirit.Teenspirit.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
public class ChatMessage {

    // Initialize fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String content;
    private LocalDateTime timestamp;

    // No-args Constructor for JPA
    public ChatMessage()
    {}

    // Constructor
    public ChatMessage(Long senderId, String content, LocalDateTime timestamp)
    {
        this.userId = senderId;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters for all fields (no setters for immutability)
    public Long getId() {
        return id;
    }

    public Long getSenderId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // Update a message's content
    public void updateContent(String newContent)
    {
        this.content = newContent;
    }

}
