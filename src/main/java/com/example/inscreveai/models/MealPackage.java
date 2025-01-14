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
@Table(name = "TB_MEAL_PACKAGE")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MealPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEAL_PACKAGE_ID")
    private Long mealPackageId;

    @Column(name = "QUANTITY", nullable = false)
    @NotNull
    private Integer quantity;

    @Column(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    /*@OneToOne
    @JoinColumn(name = "ITEM_ID", nullable = false)
    private Item itemId;*/

    /*@OneToOne
    @JoinColumn(name = "CONFIG_MEALS_ID", nullable = false)
    private ConfigMeals configMealsId;*/
}
