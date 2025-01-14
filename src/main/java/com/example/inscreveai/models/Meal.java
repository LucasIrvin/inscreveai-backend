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
@Table(name = "TB_MEAL")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEAL_ID")
    private Long mealId;

    @Column(name = "MEAL", nullable = false)
    @NotNull
    private String meal;

    /*@OneToOne
    @JoinColumn(name = "ITEM_ID", nullable = false)
    private Item itemId;*/

    /*@OneToOne
    @JoinColumn(name = "DATE_MEAL_ID", nullable = false)
    private DateMeal dateMealId;*/


}
