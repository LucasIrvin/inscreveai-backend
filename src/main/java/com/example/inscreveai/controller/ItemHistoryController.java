package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.ItemHistoryDTO;
import com.example.inscreveai.services.IItemHistoryService;
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
@RequestMapping("/itemHistory")
@CrossOrigin(origins = "*")
public class ItemHistoryController {

    @Autowired
    private IItemHistoryService itemHistoryService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<ItemHistoryDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(itemHistoryService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<ItemHistoryDTO>> findAll() {
        return ResponseEntity.ok(itemHistoryService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ItemHistoryDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(itemHistoryService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<ItemHistoryDTO> save(@RequestBody ItemHistoryDTO itemHistoryDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itemHistoryService.saveDTO(itemHistoryDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ItemHistoryDTO> update(@PathVariable Long id,
                                           @RequestBody ItemHistoryDTO itemHistoryAtualizado) {
        return ResponseEntity.ok(itemHistoryService.updateDTO(id, itemHistoryAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        itemHistoryService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
