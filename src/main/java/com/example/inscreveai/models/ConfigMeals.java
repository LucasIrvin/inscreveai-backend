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
@Table(name = "TB_CONFIG_MEALS")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigMeals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONFIG_MEALS_ID")
    private Long configMealsId;

    @JoinColumn(name = "BREAK_FAST_PRICE", nullable = false)
    @NotNull
    private Double breakfastPrice;

    @JoinColumn(name = "LAUNCH_PRICE", nullable = false)
    @NotNull
    private Double lunchPrice;

    @JoinColumn(name = "DINNER_PRICE", nullable = false)
    @NotNull
    private Double dinnerPrice;

    @JoinColumn(name = "MODE", nullable = false)
    @NotNull
    private String mode;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;

    /*@OneToMany(mappedBy = "CONFIG_MEALS")
    private List<MealDate> mealDateList;*/

    /*@OneToMany(mappedBy = "CONFIG_MEALS")
    private List<MealPackage> mealPackageList;*/


}
