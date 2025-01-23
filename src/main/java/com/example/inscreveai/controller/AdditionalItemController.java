package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.AdditionalItemDTO;
import com.example.inscreveai.services.IAdditionalItemService;
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
@RequestMapping("/additionalItem")
@CrossOrigin(origins = "*")
public class AdditionalItemController {

    @Autowired
    private IAdditionalItemService additionalItemService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<AdditionalItemDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(additionalItemService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<AdditionalItemDTO>> findAll() {
        return ResponseEntity.ok(additionalItemService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AdditionalItemDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(additionalItemService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<AdditionalItemDTO> save(@RequestBody AdditionalItemDTO additionalItemDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(additionalItemService.saveDTO(additionalItemDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AdditionalItemDTO> update(@PathVariable Long id,
                                                   @RequestBody AdditionalItemDTO additionalItemAtualizado) {
        return ResponseEntity.ok(additionalItemService.updateDTO(id, additionalItemAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        additionalItemService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
