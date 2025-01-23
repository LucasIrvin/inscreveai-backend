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
@Table(name = "TB_ITEM_HISTORY")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_HISTORY_ID")
    private Long itemHistoryId;

    @OneToOne
    @JoinColumn(name = "TRANSACTION_ITEM_ID", nullable = false)
    private TransactionItem transactionItemId;

    @OneToOne
    @JoinColumn(name = "MOVEMENT_ID", nullable = false)
    private Movement movementId;

    @OneToOne
    @JoinColumn(name = "REGISTRATION_ID", nullable = false)
    private Registration registrationId;

    @OneToOne
    @JoinColumn(name = "ITEM_ID", nullable = false)
    private Item itemId;

    @Column(name = "QUANTITY", nullable = false)
    @NotNull
    private Integer quantity;

    @Column(name = "UNIT_VALUE", nullable = false)
    @NotNull
    private Double unitValue;

    @Column(name = "TOTAL_VALUE", nullable = false)
    @NotNull
    private Double totalValue;

    @Column(name = "DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "CONDITION", nullable = false)
    @NotNull
    private String condition;

}
