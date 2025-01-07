package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.enums.TypeOfPersonEnum;
import com.example.inscreveai.models.enums.WithdrawalModeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WithdrawalAccountDTO {

    private Long loginId;

    private WithdrawalModeEnum withdrawalMode;

    private TypeOfPersonEnum typeOfPerson;

    private String key;

    private String account;

    private Integer agency;

    private String bank;

    private String holder;

    private String password;

    private Double minimumValue;



}
