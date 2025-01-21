package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.enums.MiddleOfTheMovementEnum;
import com.example.inscreveai.models.enums.MovementTypeEnum;
import com.example.inscreveai.models.enums.ReferentEnum;
import com.example.inscreveai.models.enums.TypeOfMovementEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovementDTO {

    private Long movementId;

    private Long userId;

    private Long transactionId;

    private MovementTypeEnum movementTypeEnum;

    private Double value;

    private MiddleOfTheMovementEnum middleOfTheMovementEnum;

    private TypeOfMovementEnum typeOfMovementEnum;

    private String identifier;

    private ReferentEnum referentEnum;

    private String description;

    private Double totalPaid;

    private Double totalReceivable;

    private List<String> data;

}
