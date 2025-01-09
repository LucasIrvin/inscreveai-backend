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
@Table(name = "TB_PROGRAMMING")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Programming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROGRAMMING_ID")
    private Long programmingId;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    /*@ManyToOne
    @JoinColumn(name = "EVENT_PAGE_ID")
    private EventPage eventPageId;
*/
    /*@OneToOne
    private OperatingHours operatingHours;*/



}
