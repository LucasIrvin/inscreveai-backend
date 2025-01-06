package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {

    private Long personId;

    private String name;

    private String cpf;

    private String phone;

    private LocalDate birth;

    private String region;

    private String zipCode;

    private String state;

    private String city;

    private String street;

    private String neighborhood;

    private String number;

    private Long userId;  // Representação do ID do usuário, pois estamos apenas transferindo o ID na DTO.


}
