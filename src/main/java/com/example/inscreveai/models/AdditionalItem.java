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
@Table(name = "TB_ADDITIONAL_ITEM")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdditionalItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDITIONAL_ITEM_ID")
    private Long additionalItemId;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;

    @OneToOne
    @JoinColumn(name = "ITEM_ID", nullable = false)
    private Item itemId;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @Column(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    @Column(name = "UNITS", nullable = false)
    @NotNull
    private Integer units;

}
