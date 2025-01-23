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
@Table(name = "TB_CHARGE")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Charge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHARGE_ID")
    private Long chargeId;

    @OneToOne
    @JoinColumn(name = "MOVEMENT_ID", nullable = false)
    private Movement movementId;

    @Column(name = "IDENTIFIER", nullable = false)
    @NotNull
    private String Identifier;

    @Column(name = "PAYMENT_RECEIPT", nullable = false)
    @NotNull
    private String paymentReceipt;

    @Column(name = "NUMBER", nullable = false)
    @NotNull
    private Double number;

    @Column(name = "DUE_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Column(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    @Column(name = "INTERMEDIATION_FEE", nullable = false)
    @NotNull
    private Double intermediationFee;

    @Column(name = "SYSTEM_FEE", nullable = false)
    @NotNull
    private Double systemFee;

    @Column(name = "RELEASED_VALUE", nullable = false)
    @NotNull
    private Double releasedValue;

    @Column(name = "INTEREST", nullable = false)
    @NotNull
    private Double interest;

    @Column(name = "FINE", nullable = false)
    @NotNull
    private Double fine;

    @Column(name = "DISCOUNT", nullable = false)
    @NotNull
    private Double discount;

    @Column(name = "COMPENSATION", nullable = false)
    @NotNull
    private Double compensation;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;




}
