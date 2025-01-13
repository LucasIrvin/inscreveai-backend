package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnswersDTO {

    private Long answersId;

    private Long eventId;

    private Long registrationId;


}
