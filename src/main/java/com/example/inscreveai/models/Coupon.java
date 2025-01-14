package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_COUPON")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COUPON_ID")
    private Long couponId;

    @JoinColumn(name = "CODE", nullable = false)
    @NotNull
    private String code;

    @JoinColumn(name = "UNIT", nullable = false)
    @NotNull
    private Integer unit;

    @JoinColumn(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    @JoinColumn(name = "MODE", nullable = false)
    @NotNull
    private String mode;

    @JoinColumn(name = "APPLY_TO", nullable = false)
    @NotNull
    private String applyTo;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;


}
