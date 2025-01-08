package com.example.inscreveai.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancellationPolicyDTO {

    private Long cancellationPolicyId;

    private String name;

    private String description;

    private String term;

    private Integer percentage;

}
