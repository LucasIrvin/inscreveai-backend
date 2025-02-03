package com.example.inscreveai.models;

import com.example.inscreveai.models.enums.StatusEnum;
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
@Table(name = "TB_TRANSACTION")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;

    @OneToOne
    @JoinColumn(name = "LOGIN_ID", nullable = false)
    private User userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    @NotNull
    private StatusEnum statusEnum;

    @Column(name = "DATE_OF_CREATION")
    @NotNull
    private Date date_of_Creation;

    @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "USER_ID")
      private User user;

    /*@OneToMany(mappedBy = "Transaction")
    private List<Registration> registration;*/

    /*@OneToMany(mappedBy = "Transaction")
    private List<Movement> movement;*/

    /*@OneToMany(mappedBy = "Transaction")
    private List<Item_Transação> transactionItem;*/
}
