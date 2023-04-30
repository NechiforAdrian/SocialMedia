package com.SocialMedia.SocialMedia.models.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter

public class UserDTO {

    public String firstName;
    public String lastName;
    public String email;
    public String username;
    public LocalDate birthday;
    public String address;
    public String phoneNumber;
    public int nrOfFollowers;
    public int nrFollowing;

}
