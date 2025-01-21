package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.MovementDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IMovementService {

    MovementDTO updateDTO(Long id, MovementDTO movementAtualizado);

    MovementDTO saveDTO(MovementDTO dto);

    List<MovementDTO> findAllDTO();

    Page<MovementDTO> findAllPageAsDTO(Pageable pageable);

    MovementDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
