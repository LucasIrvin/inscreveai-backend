package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MealPackageDTO {

    private Long mealPackageId;

    private Integer quantity;

    private Double value;

}
