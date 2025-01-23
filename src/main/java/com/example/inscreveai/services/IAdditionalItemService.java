package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.AdditionalItemDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IAdditionalItemService {

    AdditionalItemDTO updateDTO(Long id, AdditionalItemDTO additionalItemAtualizado);

    AdditionalItemDTO saveDTO(AdditionalItemDTO dto);

    List<AdditionalItemDTO> findAllDTO();

    Page<AdditionalItemDTO> findAllPageAsDTO(Pageable pageable);

    AdditionalItemDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
