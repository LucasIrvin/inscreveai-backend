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
@Table(name = "TB_PANELIST")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Panelist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PANELIST_ID")
    private Long panelistId;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "IMG_URL", nullable = false)
    @NotNull
    private String imgUrl;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    /*@ManyToOne
    @JoinColumn(name = "EVENT_PAGE_ID")
    private EventPage eventPage;*/
}
