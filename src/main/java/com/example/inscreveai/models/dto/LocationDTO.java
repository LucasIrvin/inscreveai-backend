package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDTO {

    private Long locationId;

    private String zipCode;

    private String state;

    private String city;

    private String street;

    private String neighborhood;

    private String number;

    private Double latitude;

    private Double longitude;

}
