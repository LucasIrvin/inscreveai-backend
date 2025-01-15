package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.MealDTO;
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
@RequestMapping("/meal")
@CrossOrigin(origins = "*")
public class MealController {

    @Autowired
    private IMealService mealService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<MealDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(mealService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<MealDTO>> findAll() {
        return ResponseEntity.ok(mealService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<MealDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(mealService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<MealDTO> save(@RequestBody MealDTO mealDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(mealService.saveDTO(mealDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<MealDTO> update(@PathVariable Long id,
                                             @RequestBody MealDTO mealAtualizado) {
        return ResponseEntity.ok(mealService.updateDTO(id, mealAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        mealService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
