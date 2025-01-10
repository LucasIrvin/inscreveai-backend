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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_REGISTRATION")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REGISTRATION_ID")
    private Long registrationId;

    @Column(name = "LEADER", nullable = false)
    @NotNull
    private String leader;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @Column(name = "CHECK_IN", nullable = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date checkIn;

    /*@OneToOne
    @JoinColumn(name = "TRANSACTION_ID", nullable = false)
    private Transaction transaction;*/

    /*@OneToMany(mappedBy = "Registration")
    private List<Response> response;*/

}
