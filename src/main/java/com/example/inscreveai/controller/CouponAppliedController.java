package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.CouponAppliedDTO;
import com.example.inscreveai.services.ICouponAppliedService;
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
@RequestMapping("/couponApplied")
@CrossOrigin(origins = "*")
public class CouponAppliedController {

    @Autowired
    private ICouponAppliedService couponAppliedService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<CouponAppliedDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(couponAppliedService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<CouponAppliedDTO>> findAll() {
        return ResponseEntity.ok(couponAppliedService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CouponAppliedDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(couponAppliedService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<CouponAppliedDTO> save(@RequestBody CouponAppliedDTO couponAppliedDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(couponAppliedService.saveDTO(couponAppliedDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CouponAppliedDTO> update(@PathVariable Long id,
                                           @RequestBody CouponAppliedDTO couponAppliedAtualizado) {
        return ResponseEntity.ok(couponAppliedService.updateDTO(id, couponAppliedAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        couponAppliedService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
