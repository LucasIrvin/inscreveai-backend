package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.InboxDTO;
import com.example.inscreveai.services.IInboxService;
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
@RequestMapping("/inbox")
@CrossOrigin(origins = "*")
public class InboxController {

    @Autowired
    private IInboxService inboxService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<InboxDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(inboxService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<InboxDTO>> findAll() {
        return ResponseEntity.ok(inboxService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<InboxDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(inboxService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<InboxDTO> save(@RequestBody InboxDTO inboxDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(inboxService.saveDTO(inboxDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<InboxDTO> update(@PathVariable Long id,
                                            @RequestBody InboxDTO inboxAtualizado) {
        return ResponseEntity.ok(inboxService.updateDTO(id, inboxAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        inboxService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
