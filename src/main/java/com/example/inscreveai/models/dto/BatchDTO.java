package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchDTO {

    private Long batchId;

    private Long eventId;

    private String description;

    private Double value;

    private Integer unit;

    private Date finish;


}
