package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.AccommodationDTO;
import com.example.inscreveai.services.IAccommodationService;
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
@RequestMapping("/accommodation")
@CrossOrigin(origins = "*")
public class AccommodationController {

    @Autowired
    private IAccommodationService accommodationService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<AccommodationDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(accommodationService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<AccommodationDTO>> findAll() {
        return ResponseEntity.ok(accommodationService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AccommodationDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(accommodationService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<AccommodationDTO> save(@RequestBody AccommodationDTO accommodationDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(accommodationService.saveDTO(accommodationDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AccommodationDTO> update(@PathVariable Long id,
                                             @RequestBody AccommodationDTO accommodationAtualizado) {
        return ResponseEntity.ok(accommodationService.updateDTO(id, accommodationAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        accommodationService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
