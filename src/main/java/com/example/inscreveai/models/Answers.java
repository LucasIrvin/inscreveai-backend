package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_ANSWERS")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID")
    private Long answersId;

    @OneToOne
    @JoinColumn(name = "Event_ID", nullable = false)
    private Event eventId;

    @OneToOne
    @JoinColumn(name = "REGISTRATION_ID", nullable = false)
    private Registration registrationId;


}
