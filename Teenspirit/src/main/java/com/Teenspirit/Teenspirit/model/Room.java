package com.Teenspirit.Teenspirit.model;
/*
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    private String title;

    @Column(nullable = false)
    private Long userId;

    // Constructor
    public Room(String title, Long userId) {
        this.title = title;
        this.userId = userId;
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

 */