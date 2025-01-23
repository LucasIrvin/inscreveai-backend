package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.Movement;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogMovementDTO {

    private Long logMovementId;

    private Long movementId;

    private String identifier;

    private Date date;

    private String event;

    private String status;

    private String description;

}
