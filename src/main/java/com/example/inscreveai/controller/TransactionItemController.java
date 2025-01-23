package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.TransactionItemDTO;
import com.example.inscreveai.services.ITransactionItemService;
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
@RequestMapping("/transactionItem")
@CrossOrigin(origins = "*")
public class TransactionItemController {

    @Autowired
    private ITransactionItemService transactionItemService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<TransactionItemDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(transactionItemService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<TransactionItemDTO>> findAll() {
        return ResponseEntity.ok(transactionItemService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<TransactionItemDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(transactionItemService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<TransactionItemDTO> save(@RequestBody TransactionItemDTO transactionItemDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionItemService.saveDTO(transactionItemDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<TransactionItemDTO> update(@PathVariable Long id,
                                           @RequestBody TransactionItemDTO transactionItemAtualizado) {
        return ResponseEntity.ok(transactionItemService.updateDTO(id, transactionItemAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        transactionItemService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
