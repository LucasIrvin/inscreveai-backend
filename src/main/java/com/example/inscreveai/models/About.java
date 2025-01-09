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
@Table(name = "TB_ABOUT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ABOUT_ID")
    private Long aboutId;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @OneToOne
    private Event eventId;


}
