package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_EVENT_DATE")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_DATE_ID")
    private Long eventDateId;

    @Column(name = "DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    /*@OneToOne
    @JoinColumn(name = "CONFIG_MEALS_ID", nullable = false)
    private ConfigMeals configMealsId;*/

    /*@OneToMany(mappedBy = "EventPage")
    private List<Meal> mealList;*/

    /*@OneToMany(mappedBy = "EventPage")
    private List<Programming> programmingList;*/

}
