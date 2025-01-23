package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionItemDTO {

    private Long transactionItemId;

    private Long transactionId;

    private Long registrationId;

    private Long itemId;

    private Integer quantity;

    private Double unitValue;

    private Double totalValue;

    private String currentStatus;

    private Date checkIn;

    private Date checkOut;

    private Integer quantityOvernight;





}
