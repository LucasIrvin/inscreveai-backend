package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.ChargeDTO;
import com.example.inscreveai.services.IChargeService;
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
@RequestMapping("/charge")
@CrossOrigin(origins = "*")
public class ChargeController {

    @Autowired
    private IChargeService chargeService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<ChargeDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(chargeService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<ChargeDTO>> findAll() {
        return ResponseEntity.ok(chargeService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ChargeDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(chargeService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<ChargeDTO> save(@RequestBody ChargeDTO chargeDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(chargeService.saveDTO(chargeDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ChargeDTO> update(@PathVariable Long id,
                                                   @RequestBody ChargeDTO chargeAtualizado) {
        return ResponseEntity.ok(chargeService.updateDTO(id, chargeAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        chargeService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
