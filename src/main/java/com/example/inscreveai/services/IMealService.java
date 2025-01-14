package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.MealDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IMealService {

    MealDTO updateDTO(Long id, MealDTO capAtualizado);

    MealDTO saveDTO(MealDTO dto);

    List<MealDTO> findAllDTO();

    Page<MealDTO> findAllPageAsDTO(Pageable pageable);

    MealDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
