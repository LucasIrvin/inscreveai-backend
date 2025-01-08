package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.CancellationPolicyDTO;
import com.example.inscreveai.services.ICancellationPolicyService;
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
@RequestMapping("/cancellationPolicy")
@CrossOrigin(origins = "*")
public class CancellationPolicyController {

    @Autowired
    private ICancellationPolicyService cancellationPolicyService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<CancellationPolicyDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(cancellationPolicyService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<CancellationPolicyDTO>> findAll() {
        return ResponseEntity.ok(cancellationPolicyService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CancellationPolicyDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(cancellationPolicyService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<CancellationPolicyDTO> save(@RequestBody CancellationPolicyDTO cancellationPolicyDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cancellationPolicyService.saveDTO(cancellationPolicyDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CancellationPolicyDTO> update(@PathVariable Long id,
                                           @RequestBody CancellationPolicyDTO cancellationPolicyAtualizado) {
        return ResponseEntity.ok(cancellationPolicyService.updateDTO(id, cancellationPolicyAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cancellationPolicyService.delete(id);
        return ResponseEntity.noContent().build();
    }




}
