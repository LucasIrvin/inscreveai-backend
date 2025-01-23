package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.ExtractDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IExtractService {

    ExtractDTO updateDTO(Long id, ExtractDTO extractAtualizado);

    ExtractDTO saveDTO(ExtractDTO dto);

    List<ExtractDTO> findAllDTO();

    Page<ExtractDTO> findAllPageAsDTO(Pageable pageable);

    ExtractDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
