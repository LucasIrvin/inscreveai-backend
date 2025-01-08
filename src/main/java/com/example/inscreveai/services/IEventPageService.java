package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.EventPageDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IEventPageService {

    EventPageDTO updateDTO(Long id, EventPageDTO eventPageAtualizado);

    EventPageDTO saveDTO(EventPageDTO dto);

    List<EventPageDTO> findAllDTO();

    Page<EventPageDTO> findAllPageAsDTO(Pageable pageable);

    EventPageDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
