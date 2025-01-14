package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_BATCH")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BATCH_ID")
    private Long batchId;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;

    @JoinColumn(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @JoinColumn(name = "VALUE", nullable = false)
    @NotNull
    private Double value;

    @JoinColumn(name = "UNIT", nullable = false)
    @NotNull
    private Integer unit;

    @JoinColumn(name = "END", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date finish;

}
