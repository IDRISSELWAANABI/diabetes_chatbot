package com.Teenspirit.Teenspirit.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
/*
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="chatmessage")
public class ChatMessage {

    // Initialize fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long roomId;

    @Column(length = 256)
    private String content;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    // Constructor
    public ChatMessage(Long userId, Long roomId, String content, LocalDateTime timestamp)
    {
        this.userId = userId;
        this.roomId = roomId;
        this.content = content;
        this.timestamp = timestamp;
    }



    // Update a message's content
    public void updateContent(String newContent)
    {
        this.content = newContent;
    }

}
 */