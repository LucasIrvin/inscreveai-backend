package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemHistoryDTO {

    private Long itemHistoryId;

    private Long transactionItemId;

    private Long movementId;

    private Long registrationId;

    private Long itemId;

    private Integer quantity;

    private Double unitValue;

    private Double totalValue;

    private Date date;

    private String condition;

}
