package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.MealPackageDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IMealPackageService {

    MealPackageDTO updateDTO(Long id, MealPackageDTO mealPackageAtualizado);

    MealPackageDTO saveDTO(MealPackageDTO dto);

    List<MealPackageDTO> findAllDTO();

    Page<MealPackageDTO> findAllPageAsDTO(Pageable pageable);

    MealPackageDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
