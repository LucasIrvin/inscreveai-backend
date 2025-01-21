package com.example.inscreveai.models;

import com.example.inscreveai.models.enums.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_MOVEMENT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MOVEMENT_ID")
    private Long movementId;

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User userId;

    @OneToOne
    @JoinColumn(name = "TRANSACTION_ID", nullable = false)
    private Transaction transactionId;

    @Enumerated(EnumType.STRING)
    @Column(name = "MOVEMENT_TYPE", nullable = false)
    @NotNull
    private MovementTypeEnum movementTypeEnum;

    @Column(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    @Enumerated(EnumType.STRING)
    @Column(name = "MIDDLE_OF_THE_MOVEMENT_ENUM", nullable = false)
    @NotNull
    private MiddleOfTheMovementEnum middleOfTheMovementEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_OF_MOVEMENT", nullable = false)
    @NotNull
    private TypeOfMovementEnum typeOfMovementEnum;

    @Column(name = "IDENTIFIER", nullable = false)
    @NotNull
    private String identifier;

    @Column(name = "REFERENT", nullable = false)
    @NotNull
    private ReferentEnum referentEnum;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @Column(name = "TOTAL_PAID", nullable = false)
    @NotNull
    private Double totalPaid;

    @Column(name = "TOTAL_RECEIVABLE", nullable = false)
    @NotNull
    private Double totalReceivable;

    @Column(name = "DATA", nullable = false)
    @NotNull
    private List<String> data;

    /*@OneToMany(mappedBy = "MOVEMENT")
    private List<logMovement> logMovement;*/

    /*@OneToMany(mappedBy = "MOVEMENT")
    private List<itemHistory> itemHistory;*/

    /*@OneToMany(mappedBy = "MOVEMENT")
    private List<Charge> charge;*/


}
