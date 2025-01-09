package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PanelistDTO {

    private Long panelistId;

    private String name;

    private String imgUrl;

    private String description;


}
