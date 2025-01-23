package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.ExtractDTO;
import com.example.inscreveai.services.IExtractService;
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
@RequestMapping("/extract")
@CrossOrigin(origins = "*")
public class ExtractController {

    @Autowired
    private IExtractService extractService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<ExtractDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(extractService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<ExtractDTO>> findAll() {
        return ResponseEntity.ok(extractService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ExtractDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(extractService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<ExtractDTO> save(@RequestBody ExtractDTO extractDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(extractService.saveDTO(extractDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ExtractDTO> update(@PathVariable Long id,
                                           @RequestBody ExtractDTO extractAtualizado) {
        return ResponseEntity.ok(extractService.updateDTO(id, extractAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        extractService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
