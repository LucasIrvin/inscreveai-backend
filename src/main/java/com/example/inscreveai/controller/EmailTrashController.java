package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.EmailTrashDTO;
import com.example.inscreveai.services.IEmailTrashService;
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
@RequestMapping("/emailTrash")
@CrossOrigin(origins = "*")
public class EmailTrashController {

    @Autowired
    private IEmailTrashService emailTrashService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<EmailTrashDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(emailTrashService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<EmailTrashDTO>> findAll() {
        return ResponseEntity.ok(emailTrashService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<EmailTrashDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(emailTrashService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<EmailTrashDTO> save(@RequestBody EmailTrashDTO emailTrashDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(emailTrashService.saveDTO(emailTrashDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<EmailTrashDTO> update(@PathVariable Long id,
                                            @RequestBody EmailTrashDTO emailTrashAtualizado) {
        return ResponseEntity.ok(emailTrashService.updateDTO(id, emailTrashAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        emailTrashService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
