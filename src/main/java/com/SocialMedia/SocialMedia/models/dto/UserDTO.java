package com.SocialMedia.SocialMedia.models.dto;

import lombok.Data;
import java.time.LocalDate;
@Data
public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private int nrOfFollowers;
    private int nrFollowing;
}
