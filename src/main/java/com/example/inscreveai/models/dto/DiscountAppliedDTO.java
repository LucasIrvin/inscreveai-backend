package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscountAppliedDTO {

    private Long discountAppliedId;

    private Long transactionItemId;

    private Long movementId;

    private Long registrationId;

    private Double value;

    private List<String> data;




}
