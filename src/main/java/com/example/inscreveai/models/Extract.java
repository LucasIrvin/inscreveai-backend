package com.example.inscreveai.models;

import com.example.inscreveai.models.enums.MovementTypeEnum;
import com.example.inscreveai.models.enums.ReferentEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_EXTRACT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Extract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXTRACT_ID")
    private Long extractId;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;

    @OneToOne
    @JoinColumn(name = "MOVEMENT_ID", nullable = false)
    private Movement movementId;

    @Column(name = "IDENTIFIER", nullable = false)
    @NotNull
    private String Identifier;

    @Column(name = "DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    @Column(name = "MOVEMENT_TYPE", nullable = false)
    @NotNull
    private MovementTypeEnum movementTypeEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "REFERENT", nullable = false)
    @NotNull
    private ReferentEnum referentEnum;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @Column(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    @Column(name = "BALANCE", nullable = false)
    @NotNull
    private Double balance;

}
