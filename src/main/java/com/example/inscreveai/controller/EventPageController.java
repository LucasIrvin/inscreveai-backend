package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.EventDTO;
import com.example.inscreveai.models.dto.EventPageDTO;
import com.example.inscreveai.services.IEventPageService;
import com.example.inscreveai.services.IEventService;
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
@RequestMapping("/eventPage")
@CrossOrigin(origins = "*")
public class EventPageController {

    @Autowired
    private IEventPageService eventPageService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<EventPageDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(eventPageService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<EventPageDTO>> findAll() {
        return ResponseEntity.ok(eventPageService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<EventPageDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(eventPageService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<EventPageDTO> save(@RequestBody EventPageDTO eventPageDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(eventPageService.saveDTO(eventPageDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<EventPageDTO> update(@PathVariable Long id,
                                           @RequestBody EventPageDTO eventPageAtualizado) {
        return ResponseEntity.ok(eventPageService.updateDTO(id, eventPageAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        eventPageService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
