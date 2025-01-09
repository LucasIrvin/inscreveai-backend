package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.PanelistDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IPanelistService {

    PanelistDTO updateDTO(Long id, PanelistDTO panelistAtualizado);

    PanelistDTO saveDTO(PanelistDTO dto);

    List<PanelistDTO> findAllDTO();

    Page<PanelistDTO> findAllPageAsDTO(Pageable pageable);

    PanelistDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
