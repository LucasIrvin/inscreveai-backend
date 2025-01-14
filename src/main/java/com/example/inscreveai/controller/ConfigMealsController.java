package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.AnswersDTO;
import com.example.inscreveai.models.dto.ConfigMealsDTO;
import com.example.inscreveai.services.IAnswersService;
import com.example.inscreveai.services.IConfigMealsService;
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
@RequestMapping("/configMeals")
@CrossOrigin(origins = "*")
public class ConfigMealsController {

    @Autowired
    private IConfigMealsService configMealsService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<ConfigMealsDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(configMealsService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<ConfigMealsDTO>> findAll() {
        return ResponseEntity.ok(configMealsService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ConfigMealsDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(configMealsService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<ConfigMealsDTO> save(@RequestBody ConfigMealsDTO configMealsDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(configMealsService.saveDTO(configMealsDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ConfigMealsDTO> update(@PathVariable Long id,
                                             @RequestBody ConfigMealsDTO configMealsAtualizado) {
        return ResponseEntity.ok(configMealsService.updateDTO(id, configMealsAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        configMealsService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
