package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.AccommodationDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IAccommodationService {

    AccommodationDTO updateDTO(Long id, AccommodationDTO accommodationAtualizado);

    AccommodationDTO saveDTO(AccommodationDTO dto);

    List<AccommodationDTO> findAllDTO();

    Page<AccommodationDTO> findAllPageAsDTO(Pageable pageable);

    AccommodationDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
