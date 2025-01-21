package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.MealDTO;
import com.example.inscreveai.models.dto.MovementDTO;
import com.example.inscreveai.services.IMealService;
import com.example.inscreveai.services.IMovementService;
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
@RequestMapping("/movement")
@CrossOrigin(origins = "*")
public class MovementController {

    @Autowired
    private IMovementService movementService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<MovementDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(movementService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<MovementDTO>> findAll() {
        return ResponseEntity.ok(movementService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<MovementDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(movementService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<MovementDTO> save(@RequestBody MovementDTO movementDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movementService.saveDTO(movementDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<MovementDTO> update(@PathVariable Long id,
                                          @RequestBody MovementDTO movementAtualizado) {
        return ResponseEntity.ok(movementService.updateDTO(id, movementAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        movementService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
