package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.PanelistDTO;
import com.example.inscreveai.services.IPanelistService;
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
@RequestMapping("/panelist")
@CrossOrigin(origins = "*")
public class PanelistController {

    @Autowired
    private IPanelistService panelistService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<PanelistDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(panelistService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<PanelistDTO>> findAll() {
        return ResponseEntity.ok(panelistService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<PanelistDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(panelistService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<PanelistDTO> save(@RequestBody PanelistDTO panelistDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(panelistService.saveDTO(panelistDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<PanelistDTO> update(@PathVariable Long id,
                                           @RequestBody PanelistDTO panelistAtualizado) {
        return ResponseEntity.ok(panelistService.updateDTO(id, panelistAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        panelistService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
