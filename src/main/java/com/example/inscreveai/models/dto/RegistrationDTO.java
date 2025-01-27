package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegistrationDTO {

    private Long registrationId;

    private String leader;

    private String status;

    private Date checkIn;


}
