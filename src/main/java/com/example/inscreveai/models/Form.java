package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_FORM")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORM_ID")
    private Long formId;

    @Column(name = "FORM", nullable = false)
    @NotNull
    private List<String> form;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String html;


}
