package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChargeDTO {

    private Long chargeId;

    private Long movementId;

    private String identifier;

    private String paymentReceipt;

    private Double number;

    private Date dueDate;

    private Double value;

    private Double intermediationFee;

    private Double systemFee;

    private Double releasedValue;

    private Double interest;

    private Double fine;

    private Double discount;

    private Double compensation;

    private String status;

    private String description;
}
