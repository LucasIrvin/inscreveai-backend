package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.DiscountAppliedDTO;
import com.example.inscreveai.services.IDiscountAppliedService;
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
@RequestMapping("/discountApplied")
@CrossOrigin(origins = "*")
public class DiscountAppliedController {

    @Autowired
    private IDiscountAppliedService discountAppliedService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<DiscountAppliedDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(discountAppliedService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<DiscountAppliedDTO>> findAll() {
        return ResponseEntity.ok(discountAppliedService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<DiscountAppliedDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(discountAppliedService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<DiscountAppliedDTO> save(@RequestBody DiscountAppliedDTO discountAppliedDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(discountAppliedService.saveDTO(discountAppliedDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<DiscountAppliedDTO> update(@PathVariable Long id,
                                           @RequestBody DiscountAppliedDTO discountAppliedAtualizado) {
        return ResponseEntity.ok(discountAppliedService.updateDTO(id, discountAppliedAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        discountAppliedService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
