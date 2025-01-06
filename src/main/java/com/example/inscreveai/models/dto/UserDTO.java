package com.example.inscreveai.models.dto;


import com.example.inscreveai.models.enums.UserProfileEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long userId;

    private String email;

    private String password;

    private UserProfileEnum userProfileEnum;

}
