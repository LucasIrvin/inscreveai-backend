package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.AboutDTO;
import com.example.inscreveai.services.IAboutService;
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
@RequestMapping("/about")
@CrossOrigin(origins = "*")
public class AboutController {

    @Autowired
    private IAboutService aboutService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<AboutDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(aboutService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<AboutDTO>> findAll() {
        return ResponseEntity.ok(aboutService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AboutDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(aboutService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<AboutDTO> save(@RequestBody AboutDTO aboutDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(aboutService.saveDTO(aboutDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<AboutDTO> update(@PathVariable Long id,
                                           @RequestBody AboutDTO aboutAtualizado) {
        return ResponseEntity.ok(aboutService.updateDTO(id, aboutAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        aboutService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
