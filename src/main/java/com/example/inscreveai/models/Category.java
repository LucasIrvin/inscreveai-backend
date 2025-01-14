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
@Table(name = "TB_CATEGORY")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "CIVIL", nullable = false)
    @NotNull
    private String civil; //É o publico

    @Column(name = "PRICE", nullable = false)
    @NotNull
    private Double price;

    @Column(name = "ADULT_CAPACITY", nullable = false)
    @NotNull
    private Integer adultCapacity;

    @Column(name = "CAPACITY_FOR_CHILDREN", nullable = false)
    @NotNull
    private Integer capacityForChildren;

    @Column(name = "MAXIMUM_AGE_CHILD", nullable = false)
    @NotNull
    private Integer maximumAgeChild;

    @Column(name = "BABY_CAPACITY", nullable = false)
    @NotNull
    private Integer babyCapacity;

    @Column(name = "MAXIMUM_AGE_BABY", nullable = false)
    @NotNull
    private String maximumAgeBaby;

    @Column(name = "ALLOW_RESERVATION", nullable = false)
    @NotNull
    private String allowReservation;

    @Column(name = "MINIMUM_NIGHT", nullable = false)
    @NotNull
    private String minimumNight;

    @OneToOne
    @JoinColumn(name = "Event_ID", nullable = false)
    private Event eventId;


    /*@OneToMany(mappedBy = "CATEGORY")
    private List<Hosting> hostingList;*/

}
