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
@Table(name = "TB_CAP")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAP_ID")
    private Long capId;

    @Column(name = "IMG_URL", nullable = false)
    @NotNull
    private String imgUrl;

    @Column(name = "TITLE", nullable = false)
    @NotNull
    private String title;

    /*@ManyToOne
    @JoinColumn(name = "EVENT_PAGE_ID")
    private EventPage eventPage;*/

}
