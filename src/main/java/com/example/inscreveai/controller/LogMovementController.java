package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.LogMovementDTO;
import com.example.inscreveai.services.ILogMovementService;
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
@RequestMapping("/logMovement")
@CrossOrigin(origins = "*")
public class LogMovementController {

    @Autowired
    private ILogMovementService logMovementService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<LogMovementDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(logMovementService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<LogMovementDTO>> findAll() {
        return ResponseEntity.ok(logMovementService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<LogMovementDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(logMovementService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<LogMovementDTO> save(@RequestBody LogMovementDTO logMovementDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(logMovementService.saveDTO(logMovementDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<LogMovementDTO> update(@PathVariable Long id,
                                           @RequestBody LogMovementDTO logMovementAtualizado) {
        return ResponseEntity.ok(logMovementService.updateDTO(id, logMovementAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        logMovementService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
