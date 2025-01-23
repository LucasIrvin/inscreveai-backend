package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdditionalItemDTO {

    private Long additionalItemId;

    private Long eventId;

    private Long itemId;

    private String name;

    private String description;

    private Double value;

    private Integer units;

}
