package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.RegistrationDTO;
import com.example.inscreveai.services.IRegistrationService;
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
@RequestMapping("/registration")
@CrossOrigin(origins = "*")
public class RegistrationController {

    @Autowired
    private IRegistrationService registrationService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<RegistrationDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(registrationService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<RegistrationDTO>> findAll() {
        return ResponseEntity.ok(registrationService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<RegistrationDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(registrationService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<RegistrationDTO> save(@RequestBody RegistrationDTO registrationDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(registrationService.saveDTO(registrationDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<RegistrationDTO> update(@PathVariable Long id,
                                                 @RequestBody RegistrationDTO registrationAtualizado) {
        return ResponseEntity.ok(registrationService.updateDTO(id, registrationAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        registrationService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
