package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_PERSON")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID")
    private Long personId;

    @Column(name = "NAME", nullable = false)
    @NotNull(message = "O nome é obrigatório.")
    @Size(max = 100)
    private String name;

    @Column(name = "CPF", nullable = false)
    @NotNull(message = "O CPF é obrigatório")
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter 11 dígitos.")
    private String cpf;

    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Column(name = "BIRTH", nullable = false)
    private LocalDate birth;

    @Column(name = "REGION", nullable = false)
    @Size(max = 25)
    private String region;

    @Column(name = "ZIP_CODE", nullable = false)
    @Size(max = 10)
    private String zipCode;

    @Column(name = "STATE", nullable = false)
    private String state;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "NEIGHBORHOOD", nullable = false)
    private String neighborhood;

    @Column(name = "NUMBER", nullable = false)
    private String number;

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User userId;



}
