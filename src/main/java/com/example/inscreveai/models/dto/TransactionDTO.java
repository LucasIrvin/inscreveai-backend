package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDTO {

    private Long transactionId;

    private Long eventId;

    private Long userId;

    private StatusEnum statusEnum;

    private Date date_of_Creation;

}
