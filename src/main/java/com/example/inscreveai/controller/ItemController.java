package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.ItemDTO;
import com.example.inscreveai.services.IItemService;
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
@RequestMapping("/item")
@CrossOrigin(origins = "*")
public class ItemController {

    @Autowired
    private IItemService itemService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<ItemDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(itemService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<ItemDTO>> findAll() {
        return ResponseEntity.ok(itemService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ItemDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(itemService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<ItemDTO> save(@RequestBody ItemDTO itemDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.saveDTO(itemDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<ItemDTO> update(@PathVariable Long id,
                                           @RequestBody ItemDTO itemAtualizado) {
        return ResponseEntity.ok(itemService.updateDTO(id, itemAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        itemService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
