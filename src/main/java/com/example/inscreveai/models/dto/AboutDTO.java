package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.Event;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AboutDTO {

    private Long aboutId;

    private String description;

    private Long eventId;


}
