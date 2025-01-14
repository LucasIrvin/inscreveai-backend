package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.Event;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO {

    private Long categoryId;

    private Long eventId;

    private String name;

    private String civil;

    private Double price;

    private Integer adultCapacity;

    private Integer capacityForChildren;

    private Integer maximumAgeChild;

    private Integer babyCapacity;

    private String maximumAgeBaby;

    private String allowReservation;

    private String minimumNight;





}
