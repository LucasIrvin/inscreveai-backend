package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccommodationDTO {

    private Long accommodationId;

    private Long categoryId;

    private String title;

    private String description;

    private Integer adultVacancies;

    private Integer childrenVacancies;

    private Integer babyVacancies;

    private String status;

    private List<String> photos;

}
