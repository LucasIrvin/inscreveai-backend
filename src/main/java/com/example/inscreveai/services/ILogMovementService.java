package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.LogMovementDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ILogMovementService {

    LogMovementDTO updateDTO(Long id, LogMovementDTO logMovementAtualizado);

    LogMovementDTO saveDTO(LogMovementDTO dto);

    List<LogMovementDTO> findAllDTO();

    Page<LogMovementDTO> findAllPageAsDTO(Pageable pageable);

    LogMovementDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
