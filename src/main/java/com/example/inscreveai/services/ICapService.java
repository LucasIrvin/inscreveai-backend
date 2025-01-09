package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.CapDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ICapService {

    CapDTO updateDTO(Long id, CapDTO capAtualizado);

    CapDTO saveDTO(CapDTO dto);

    List<CapDTO> findAllDTO();

    Page<CapDTO> findAllPageAsDTO(Pageable pageable);

    CapDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
