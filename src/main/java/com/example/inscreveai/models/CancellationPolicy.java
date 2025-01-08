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
@Table(name = "TB_CANCELLATION_POLICY")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancellationPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CANCELLATION_POLICY_ID")
    private Long cancellationPolicyId;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @Column(name = "TERM", nullable = false)
    @NotNull
    private String term;

    @Column(name = "PERCENTAGE", nullable = false)
    @NotNull
    private Integer percentage;


}
