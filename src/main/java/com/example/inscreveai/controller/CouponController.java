package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.CouponDTO;
import com.example.inscreveai.services.ICouponService;
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
@RequestMapping("/coupon")
@CrossOrigin(origins = "*")
public class CouponController {

    @Autowired
    private ICouponService couponService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<CouponDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.ok(couponService.findAllPageAsDTO(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<CouponDTO>> findAll() {
        return ResponseEntity.ok(couponService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CouponDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(couponService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<CouponDTO> save(@RequestBody CouponDTO couponDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(couponService.saveDTO(couponDTO));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<CouponDTO> update(@PathVariable Long id,
                                             @RequestBody CouponDTO couponAtualizado) {
        return ResponseEntity.ok(couponService.updateDTO(id, couponAtualizado));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        couponService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
