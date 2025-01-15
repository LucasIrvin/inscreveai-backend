package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.ProgrammingDTO;
import com.example.inscreveai.services.IProgrammingService;
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
@RequestMapping("/programming")
@CrossOrigin(origins = "*")
public class ProgrammingController {

    @Autowired
    private IProgrammingService programmingService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<ProgrammingDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(programmingService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<ProgrammingDTO>> findAll() {
        return ResponseEntity.ok(programmingService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ProgrammingDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(programmingService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<ProgrammingDTO> save(@RequestBody ProgrammingDTO programmingDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(programmingService.saveDTO(programmingDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ProgrammingDTO> update(@PathVariable Long id,
                                           @RequestBody ProgrammingDTO programmingAtualizado) {
        return ResponseEntity.ok(programmingService.updateDTO(id, programmingAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        programmingService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
