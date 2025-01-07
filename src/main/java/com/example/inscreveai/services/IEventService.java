package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.EventDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IEventService {

    EventDTO updateDTO(Long id, EventDTO eventAtualizado);

    EventDTO saveDTO(EventDTO dto);

    List<EventDTO> findAllDTO();

    Page<EventDTO> findAllPageAsDTO(Pageable pageable);

    EventDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
