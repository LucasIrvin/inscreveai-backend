package com.example.inscreveai.models.dto;


import java.util.List;

import com.example.inscreveai.models.Event;
import com.example.inscreveai.models.Transaction;
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

    private Long personId; // Representação do ID da pessoa, pois estamos apenas transferindo o ID na DTO.

    private List<TransactionDTO> transactions;

    private List<EventDTO> events;
}
