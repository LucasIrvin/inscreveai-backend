package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.FormDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IFormService {

    FormDTO updateDTO(Long id, FormDTO formAtualizado);

    FormDTO saveDTO(FormDTO dto);

    List<FormDTO> findAllDTO();

    FormDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

    Page<FormDTO> findAllPageAsDTO(Pageable pageable);
}
