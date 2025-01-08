package com.example.inscreveai.models.dto;

import com.example.inscreveai.models.Event;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventPageDTO {

    private Long eventPageId;

    private Long eventId;


}
