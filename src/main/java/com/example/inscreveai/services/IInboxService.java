package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.InboxDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IInboxService {

    InboxDTO updateDTO(Long id, InboxDTO inboxAtualizado);

    InboxDTO saveDTO(InboxDTO dto);

    List<InboxDTO> findAllDTO();

    Page<InboxDTO> findAllPageAsDTO(Pageable pageable);

    InboxDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
