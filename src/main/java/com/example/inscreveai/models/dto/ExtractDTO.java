package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.enums.MovementTypeEnum;
import com.example.inscreveai.models.enums.ReferentEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtractDTO {

    private Long extractId;

    private Long eventId;

    private Long movementId;

    private String identifier;

    private Date date;

    private MovementTypeEnum movementTypeEnum;

    private ReferentEnum referentEnum;

    private String description;

    private Double value;

    private Double balance;



}
