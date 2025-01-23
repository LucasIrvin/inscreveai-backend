package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.DiscountAppliedDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IDiscountAppliedService {

    DiscountAppliedDTO updateDTO(Long id, DiscountAppliedDTO discountAppliedAtualizado);

    DiscountAppliedDTO saveDTO(DiscountAppliedDTO dto);

    List<DiscountAppliedDTO> findAllDTO();

    Page<DiscountAppliedDTO> findAllPageAsDTO(Pageable pageable);

    DiscountAppliedDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
