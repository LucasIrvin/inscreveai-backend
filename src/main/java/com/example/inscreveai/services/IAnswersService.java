package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.AnswersDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IAnswersService {

    AnswersDTO updateDTO(Long id, AnswersDTO AnswersAtualizado);

    AnswersDTO saveDTO(AnswersDTO dto);

    List<AnswersDTO> findAllDTO();

    Page<AnswersDTO> findAllPageAsDTO(Pageable pageable);

    AnswersDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
