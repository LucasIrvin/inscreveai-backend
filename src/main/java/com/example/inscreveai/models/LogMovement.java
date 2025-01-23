package com.example.inscreveai.models;

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
@Table(name = "TB_LOG_MOVEMENT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOG_MOVEMENT_ID")
    private Long logMovementId;

    @OneToOne
    @JoinColumn(name = "MOVEMENT_ID", nullable = false)
    private Movement movementId;

    @Column(name = "IDENTIFIER", nullable = false)
    @NotNull
    private String Identifier;

    @Column(name = "DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "EVENT", nullable = false)
    @NotNull
    private String event;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    /*@OneToMany(mappedBy = "LOG_MOVEMENT")
    private List<Data> data;*/

}
