package com.example.inscreveai.controller;

import com.example.inscreveai.anotations.CommonApiResponses;
import com.example.inscreveai.models.dto.UserDTO;
import com.example.inscreveai.services.IUserService;
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
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/page")
    @CommonApiResponses
    public ResponseEntity<Page<UserDTO>> findAllPages(@PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {

        return ResponseEntity.ok(userService.findAllPageAsDto(pageable));
    }

    @GetMapping
    @CommonApiResponses
    public ResponseEntity<List<UserDTO>> findAll() {

        return ResponseEntity.ok(userService.findAllDTO());
    }

    @GetMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findByIdDTO(id));
    }

    @PostMapping
    @CommonApiResponses
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveDTO(user));
    }

    @PutMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<UserDTO> update(@PathVariable Long id,
                                          @RequestBody UserDTO userAtualizada) {
        return ResponseEntity.ok(userService.updateDTO(id, userAtualizada));
    }

    @PutMapping("/{id}/password")
    @CommonApiResponses
    public ResponseEntity<Object> updatePassword(@PathVariable Long id,
                                                 @RequestBody UserDTO userAtualizada) {

        return ResponseEntity.ok(userService.updateDTO(id, userAtualizada));
    }

    @DeleteMapping("/{id}")
    @CommonApiResponses
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
