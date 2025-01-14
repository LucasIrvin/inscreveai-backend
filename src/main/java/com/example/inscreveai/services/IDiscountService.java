package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.DiscountDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IDiscountService {

    DiscountDTO updateDTO(Long id, DiscountDTO discountAtualizado);

    DiscountDTO saveDTO(DiscountDTO dto);

    List<DiscountDTO> findAllDTO();

    Page<DiscountDTO> findAllPageAsDTO(Pageable pageable);

    DiscountDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
