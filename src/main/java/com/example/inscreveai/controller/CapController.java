package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.CapDTO;
import com.example.inscreveai.services.ICapService;
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
@RequestMapping("/cap")
@CrossOrigin(origins = "*")
public class CapController {

    @Autowired
    private ICapService capService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<CapDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(capService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<CapDTO>> findAll() {
        return ResponseEntity.ok(capService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CapDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(capService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<CapDTO> save(@RequestBody CapDTO capDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(capService.saveDTO(capDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CapDTO> update(@PathVariable Long id,
                                           @RequestBody CapDTO capAtualizado) {
        return ResponseEntity.ok(capService.updateDTO(id, capAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        capService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
