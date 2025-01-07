package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.UserDTO;
import com.example.inscreveai.models.dto.WithdrawalAccountDTO;
import com.example.inscreveai.services.IWithdrawalAccountService;
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
@RequestMapping("/withdrawalAccount")
@CrossOrigin(origins = "*")
public class WithdrawalAccountController {

    @Autowired
    private IWithdrawalAccountService withdrawalAccountService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<WithdrawalAccountDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(withdrawalAccountService.findAllPageAsDto(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<WithdrawalAccountDTO>> findAll() {
        return ResponseEntity.ok(withdrawalAccountService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<WithdrawalAccountDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(withdrawalAccountService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<WithdrawalAccountDTO> save(@RequestBody WithdrawalAccountDTO withdrawalAccountDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(withdrawalAccountService.saveDTO(withdrawalAccountDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<WithdrawalAccountDTO> update(@PathVariable Long id,
                                          @RequestBody WithdrawalAccountDTO withdrawalAccountAtualizada) {
        return ResponseEntity.ok(withdrawalAccountService.updateDTO(id, withdrawalAccountAtualizada));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        withdrawalAccountService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
