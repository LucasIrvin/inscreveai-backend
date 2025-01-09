package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.ProgrammingDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IProgrammingService {

    ProgrammingDTO updateDTO(Long id, ProgrammingDTO programmingAtualizado);

    ProgrammingDTO saveDTO(ProgrammingDTO dto);

    List<ProgrammingDTO> findAllDTO();

    Page<ProgrammingDTO> findAllPageAsDTO(Pageable pageable);

    ProgrammingDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
