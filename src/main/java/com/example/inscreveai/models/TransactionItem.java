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
@Table(name = "TB_TRANSACTION_ITEM")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ITEM_ID")
    private Long transactionItemId;

    @OneToOne
    @JoinColumn(name = "TRANSACTION_ID", nullable = false)
    private Transaction transactionId;

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

    @Column(name = "CURRENT_STATUS", nullable = false)
    @NotNull
    private String currentStatus;

    @Column(name = "CHECK_IN", nullable = false)
    @NotNull
    private Date checkIn;

    @Column(name = "CHECK_OUT", nullable = false)
    @NotNull
    private Date checkOut;

    @Column(name = "QUANTITY_OVERNIGHT", nullable = false)
    @NotNull
    private Integer quantityOvernight;

    /*@OneToMany(mappedBy = "TRANSACTION_ITEM")
    private List<ItemHistory> itemHistory;*/


}
