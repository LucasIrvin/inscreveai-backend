package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.EventDateDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IEventDateService {

    EventDateDTO updateDTO(Long id, EventDateDTO eventDateAtualizado);

    EventDateDTO saveDTO(EventDateDTO dto);

    List<EventDateDTO> findAllDTO();

    Page<EventDateDTO> findAllPageAsDTO(Pageable pageable);

    EventDateDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
