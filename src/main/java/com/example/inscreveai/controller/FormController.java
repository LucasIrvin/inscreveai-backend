package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.FormDTO;
import com.example.inscreveai.models.dto.MealDTO;
import com.example.inscreveai.services.IFormService;
import com.example.inscreveai.services.IMealService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/form")
@CrossOrigin(origins = "*")
public class FormController {

    @Autowired
    private IFormService formService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<FormDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(formService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<FormDTO>> findAll() {
        return ResponseEntity.ok(formService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<FormDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(formService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<FormDTO> save(@RequestBody FormDTO formDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(formService.saveDTO(formDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<FormDTO> update(@PathVariable Long id,
                                          @RequestBody FormDTO formAtualizado) {
        return ResponseEntity.ok(formService.updateDTO(id, formAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        formService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
