package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.BatchDTO;
import com.example.inscreveai.services.IBatchService;
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
@RequestMapping("/batch")
@CrossOrigin(origins = "*")
public class BatchController {

    @Autowired
    private IBatchService batchService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<BatchDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(batchService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<BatchDTO>> findAll() {
        return ResponseEntity.ok(batchService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<BatchDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(batchService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<BatchDTO> save(@RequestBody BatchDTO batchDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(batchService.saveDTO(batchDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<BatchDTO> update(@PathVariable Long id,
                                             @RequestBody BatchDTO batchAtualizado) {
        return ResponseEntity.ok(batchService.updateDTO(id, batchAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        batchService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
