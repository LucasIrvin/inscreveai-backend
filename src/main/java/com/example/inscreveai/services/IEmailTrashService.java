package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.EmailTrashDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IEmailTrashService {

    EmailTrashDTO updateDTO(Long id, EmailTrashDTO emailTrashAtualizado);

    EmailTrashDTO saveDTO(EmailTrashDTO dto);

    List<EmailTrashDTO> findAllDTO();

    Page<EmailTrashDTO> findAllPageAsDTO(Pageable pageable);

    EmailTrashDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);


}
