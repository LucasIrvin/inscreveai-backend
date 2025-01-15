package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.DiscountDTO;
import com.example.inscreveai.services.IDiscountService;
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
@RequestMapping("/discount")
@CrossOrigin(origins = "*")
public class DiscountController {

    @Autowired
    private IDiscountService discountService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<DiscountDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(discountService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<DiscountDTO>> findAll() {
        return ResponseEntity.ok(discountService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<DiscountDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(discountService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<DiscountDTO> save(@RequestBody DiscountDTO discountDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(discountService.saveDTO(discountDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<DiscountDTO> update(@PathVariable Long id,
                                             @RequestBody DiscountDTO discountAtualizado) {
        return ResponseEntity.ok(discountService.updateDTO(id, discountAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        discountService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
