package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.OutboxDTO;
import com.example.inscreveai.services.IOutboxService;
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
@RequestMapping("/outbox")
@CrossOrigin(origins = "*")
public class OutboxController {

    @Autowired
    private IOutboxService outboxService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<OutboxDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(outboxService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<OutboxDTO>> findAll() {
        return ResponseEntity.ok(outboxService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<OutboxDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(outboxService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<OutboxDTO> save(@RequestBody OutboxDTO outboxDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(outboxService.saveDTO(outboxDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<OutboxDTO> update(@PathVariable Long id,
                                            @RequestBody OutboxDTO outboxAtualizado) {
        return ResponseEntity.ok(outboxService.updateDTO(id, outboxAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        outboxService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
