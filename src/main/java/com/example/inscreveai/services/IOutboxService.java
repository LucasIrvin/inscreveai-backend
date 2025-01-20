package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.OutboxDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IOutboxService {

    OutboxDTO updateDTO(Long id, OutboxDTO outboxAtualizado);

    OutboxDTO saveDTO(OutboxDTO dto);

    List<OutboxDTO> findAllDTO();

    Page<OutboxDTO> findAllPageAsDTO(Pageable pageable);

    OutboxDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);


}
