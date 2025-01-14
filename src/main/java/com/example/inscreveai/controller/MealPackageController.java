package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.MealPackageDTO;
import com.example.inscreveai.services.IMealPackageService;
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
@RequestMapping("/mealPackage")
@CrossOrigin(origins = "*")
public class MealPackageController {

    @Autowired
    private IMealPackageService mealPackageService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<MealPackageDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(mealPackageService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<MealPackageDTO>> findAll() {
        return ResponseEntity.ok(mealPackageService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<MealPackageDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(mealPackageService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<MealPackageDTO> save(@RequestBody MealPackageDTO mealPackageDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(mealPackageService.saveDTO(mealPackageDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<MealPackageDTO> update(@PathVariable Long id,
                                             @RequestBody MealPackageDTO mealPackageAtualizado) {
        return ResponseEntity.ok(mealPackageService.updateDTO(id, mealPackageAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        mealPackageService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
