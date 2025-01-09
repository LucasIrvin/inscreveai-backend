package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.LocationDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ILocationService {

    LocationDTO updateDTO(Long id, LocationDTO locationAtualizado);

    LocationDTO saveDTO(LocationDTO dto);

    List<LocationDTO> findAllDTO();

    Page<LocationDTO> findAllPageAsDTO(Pageable pageable);

    LocationDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
