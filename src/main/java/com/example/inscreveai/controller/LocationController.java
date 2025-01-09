package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.LocationDTO;
import com.example.inscreveai.services.ILocationService;
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
@RequestMapping("/location")
@CrossOrigin(origins = "*")
public class LocationController {

    @Autowired
    private ILocationService locationService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<LocationDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(locationService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<LocationDTO>> findAll() {
        return ResponseEntity.ok(locationService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<LocationDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(locationService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<LocationDTO> save(@RequestBody LocationDTO locationDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(locationService.saveDTO(locationDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<LocationDTO> update(@PathVariable Long id,
                                           @RequestBody LocationDTO locationAtualizado) {
        return ResponseEntity.ok(locationService.updateDTO(id, locationAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        locationService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
