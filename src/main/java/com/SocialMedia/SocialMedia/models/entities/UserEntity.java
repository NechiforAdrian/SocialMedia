package com.SocialMedia.SocialMedia.models.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String userPassword;
    private LocalDate createdAt;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private int nrOfFollowers;
    private int nrFollowing;

}
