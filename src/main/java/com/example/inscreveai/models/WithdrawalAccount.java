package com.example.inscreveai.models;

import com.example.inscreveai.models.enums.TypeOfPersonEnum;
import com.example.inscreveai.models.enums.WithdrawalModeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_WITHDRAWAL_ACCOUNT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WithdrawalAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOGIN_ID")
    private Long loginId;

    @Enumerated(EnumType.STRING)
    @Column(name = "WITHDRAWAL_MODE", nullable = false)
    @NotNull
    private WithdrawalModeEnum withdrawalMode;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_OF_PERSON", nullable = false)
    @NotNull
    private TypeOfPersonEnum typeOfPerson;

    @Column(name = "KEY", nullable = false)
    @NotNull
    @Size(min = 5, max = 100)
    private String key;

    @Column(name = "ACCOUNT", nullable = false)
    @NotNull
    @Size(max = 25)
    private String account;

    @Column(name = "AGENCY", nullable = false)
    @NotNull
    @Size(max = 10)
    private Integer agency;

    @Column(name = "BANK", nullable = false)
    @NotNull
    private String bank;

    @Column(name = "HOLDER", nullable = false)
    @NotNull
    private String holder;

    @Column(name = "PASSWORD", nullable = false)
    @NotNull(message = "A senha é obrigatória.")
    @Size(min = 5, max = 20)
    private String password;

    @Column(name = "MINIMUM_VALUE", nullable = false)
    @NotNull
    private Double minimumValue;





}
