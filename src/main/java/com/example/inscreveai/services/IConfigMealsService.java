package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.ConfigMealsDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IConfigMealsService {

    ConfigMealsDTO updateDTO(Long id, ConfigMealsDTO configMealsAtualizado);

    ConfigMealsDTO saveDTO(ConfigMealsDTO dto);

    List<ConfigMealsDTO> findAllDTO();

    Page<ConfigMealsDTO> findAllPageAsDTO(Pageable pageable);

    ConfigMealsDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
