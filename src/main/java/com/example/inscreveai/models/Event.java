package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_EVENT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_ID")
    private Long eventId;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "URL", nullable = false)
    @NotNull
    private String url;

    @Column(name = "CAPACITY", nullable = false)
    @NotNull
    private Integer capacity;

    @Column(name = "WHATSAPP", nullable = false)
    @NotNull
    private String whatsapp;

    @Column(name = "VACANCIES", nullable = false)
    @NotNull
    private Integer vacancies;

    @Column(name = "CLOSING", nullable = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date closing;

    @Column(name = "START", nullable = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date start;

    @Column(name = "FINISH", nullable = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date finish;

    @Column(name = "NUMBER_OF_SUBSCRIBERS", nullable = false)
    @NotNull
    private Integer numberOfSubscribers;

    @Column(name = "REGISTRATION_CONFIRMED")
    @NotNull
    private Integer registrationConfirmed;

    @Column(name = "PENDING_REGISTRATIONS")
    @NotNull
    private Integer pendingRegistrations;

    @Column(name = "FUTURE_RELEASES")
    @NotNull
    private Integer futureReleases;

    @Column(name = "AVAILABLE_BALANCE")
    @NotNull
    private Double availableBalance;

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User userId;

    @OneToOne
    private CancellationPolicy cancellationPolicy;

    @OneToOne
    private EventPage eventPage;

    /*@OneToOne
    private Form form;*/

    /*@OneToOne
    private ConfigMeals configMeals;*/

    /*@OneToOne
    private Payment payment;*/

    /*@OneToMany(mappedBy = "Event")
    private List<Answers> answers;*/

    /*@OneToMany(mappedBy = "Event")
    private List<Batch> batch;*/

    /*@OneToMany(mappedBy = "Event")
    private List<Discount> discount;*/

    /*@OneToMany(mappedBy = "Event")
    private List<Coupon> coupon;*/

    /*@OneToMany(mappedBy = "Event")
    private List<Transaction> transaction;*/

    /*@OneToMany(mappedBy = "Event")
    private List<Categories> categories;*/

    /*@OneToMany(mappedBy = "Event")
    private List<Email> emails;*/

    /*@OneToMany(mappedBy = "Event")
    private List<AdditionalItem> additionalItems;*/




}
