package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailTrashDTO {

    private Long emailTrashId;

    private Long eventId;

    private Long registrationId;

    private String recipient;

    private String sender;

    private String subject;

    private String body;

    private String status;

    private Date shippingDate;

}
