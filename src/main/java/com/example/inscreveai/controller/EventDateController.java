package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.EventDateDTO;
import com.example.inscreveai.services.IEventDateService;
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
@RequestMapping("/eventDate")
@CrossOrigin(origins = "*")
public class EventDateController {

    @Autowired
    private IEventDateService eventDateService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<EventDateDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(eventDateService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<EventDateDTO>> findAll() {
        return ResponseEntity.ok(eventDateService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<EventDateDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(eventDateService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<EventDateDTO> save(@RequestBody EventDateDTO eventDateDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(eventDateService.saveDTO(eventDateDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<EventDateDTO> update(@PathVariable Long id,
                                             @RequestBody EventDateDTO eventDateAtualizado) {
        return ResponseEntity.ok(eventDateService.updateDTO(id, eventDateAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        eventDateService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
