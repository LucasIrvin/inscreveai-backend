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
@Table(name = "TB_ACCOMMODATION")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOMMODATION_ID")
    private Long accommodationId;

    @OneToOne
    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    private Category categoryId;

    /*@OneToOne
    @JoinColumn(name = "ITEM_ID", nullable = false)
    private Item itemId;*/

    @Column(name = "TITLE", nullable = false)
    @NotNull
    private String title;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @Column(name = "ADULT_VACANCIES", nullable = false)
    @NotNull
    private Integer adultVacancies;

    @Column(name = "CHILDREN_VACANCIES", nullable = false)
    @NotNull
    private Integer childrenVacancies;

    @Column(name = "BABY_VACANCIES", nullable = false)
    @NotNull
    private Integer babyVacancies;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @ElementCollection
    @Column(name = "PHOTOS", nullable = false)
    @NotNull
    private List<String> photos;



}
