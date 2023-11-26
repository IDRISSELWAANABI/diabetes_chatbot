package com.Teenspirit.Teenspirit.Dto;

import lombok.Getter;

@Getter
public class userRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public userRegistrationDto(String firstName, String lastName, String email, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public userRegistrationDto() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
