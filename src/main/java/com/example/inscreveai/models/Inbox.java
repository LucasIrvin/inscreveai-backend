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
@Table(name = "TB_INBOX")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inbox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INBOX_ID")
    private Long inboxId;

    @OneToOne
    @JoinColumn(name = "REGISTRATION_ID", nullable = false)
    private Registration registrationId;

    @Column(name = "RECIPIENT", nullable = false)
    @NotNull
    private String recipient;

    @Column(name = "SENDER", nullable = false)
    @NotNull
    private String sender;

    @Column(name = "SUBJECT", nullable = false)
    @NotNull
    private String subject;

    @Column(name = "BODY", nullable = false)
    @NotNull
    private String body;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @Column(name = "SHIPPING_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date shippingDate;

}
