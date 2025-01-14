package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CouponDTO {

    private Long couponId;

    private Long eventId;

    private String code;

    private Integer unit;

    private Double value;

    private String mode;

    private String applyTo;

}
