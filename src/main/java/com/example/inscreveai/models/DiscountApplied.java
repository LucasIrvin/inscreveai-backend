package com.example.inscreveai.models;

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
@Table(name = "TB_DISCOUNT_APPLIED")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscountApplied {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DISCOUNT_APPLIED_ID")
    private Long discountAppliedId;

    @OneToOne
    @JoinColumn(name = "TRANSACTION_ITEM_ID", nullable = false)
    private TransactionItem transactionItemId;

    @OneToOne
    @JoinColumn(name = "MOVEMENT_ID", nullable = false)
    private Movement movementId;

    @OneToOne
    @JoinColumn(name = "REGISTRATION_ID", nullable = false)
    private Registration registrationId;

    @Column(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    @ElementCollection
    @Column(name = "DATA", nullable = false)
    @NotNull
    private List<String> data;

}
