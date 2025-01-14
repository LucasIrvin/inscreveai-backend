package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.CategoryDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ICategoryService {

    CategoryDTO updateDTO(Long id, CategoryDTO categoryAtualizado);

    CategoryDTO saveDTO(CategoryDTO dto);

    List<CategoryDTO> findAllDTO();

    Page<CategoryDTO> findAllPageAsDTO(Pageable pageable);

    CategoryDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
