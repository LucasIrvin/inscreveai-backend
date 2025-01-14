package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_DISCOUNT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DISCOUNT_ID")
    private Long discountId;

    @JoinColumn(name = "AGE_OF", nullable = false)
    @NotNull
    private Integer ageOf;

    @JoinColumn(name = "UNTIL_AGE", nullable = false)
    @NotNull
    private Integer untilAge;

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
