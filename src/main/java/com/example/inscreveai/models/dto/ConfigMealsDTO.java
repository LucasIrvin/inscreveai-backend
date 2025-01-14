package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigMealsDTO {

    private Long configMealsId;

    private Long eventId;

    private Double breakfastPrice;

    private Double lunchPrice;

    private Double dinnerPrice;

    private String mode;

}
