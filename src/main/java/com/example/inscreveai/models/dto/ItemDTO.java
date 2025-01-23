package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDTO {

    private Long itemId;

    private Long eventId;

    private String type;

    private String itemDescription;

}
