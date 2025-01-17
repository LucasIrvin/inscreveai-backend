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
@Table(name = "TB_PAYMENT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYMENT_ID")
    private Long paymentId;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;

    @Column(name = "PAYMENT_LIST", nullable = false)
    @NotNull
    private List<String> paymentList;

}
