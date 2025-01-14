package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscountDTO {

    private Long discountId;

    private Long eventId;

    private Integer ageOf;

    private Integer untilAge;

    private Double value;

    private String mode;

    private String applyTo;


}
