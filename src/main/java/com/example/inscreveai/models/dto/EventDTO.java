package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventDTO {

    private Long eventId;

    private String status;

    private String name;

    private String url;

    private Integer capacity;

    private String whatsapp;

    private Integer vacancies;

    private Date closing;

    private Date start;

    private Date finish;

    private Integer numberOfSubscribers;

    private Integer registrationConfirmed;

    private Integer pendingRegistrations;

    private Integer futureReleases;

    private Double availableBalance;

    private Long userId;

    private Long eventPageId;
}
