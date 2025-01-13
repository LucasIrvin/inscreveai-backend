package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.AnswersDTO;
import com.example.inscreveai.models.dto.CapDTO;
import com.example.inscreveai.services.IAnswersService;
import com.example.inscreveai.services.ICapService;
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
@RequestMapping("/answers")
@CrossOrigin(origins = "*")
public class AnswersController {

    @Autowired
    private IAnswersService answersService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<AnswersDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(answersService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<AnswersDTO>> findAll() {
        return ResponseEntity.ok(answersService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AnswersDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(answersService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<AnswersDTO> save(@RequestBody AnswersDTO answersDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(answersService.saveDTO(answersDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AnswersDTO> update(@PathVariable Long id,
                                         @RequestBody AnswersDTO answersAtualizado) {
        return ResponseEntity.ok(answersService.updateDTO(id, answersAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        answersService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
