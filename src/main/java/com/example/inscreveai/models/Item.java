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
@Table(name = "TB_ITEM")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long itemId;

    @OneToOne
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event eventId;

    @Column(name = "TYPE", nullable = false)
    @NotNull
    private String type;

    @Column(name = "ITEM_DESCRIPTION", nullable = false)
    @NotNull
    private String itemDescription;

}
