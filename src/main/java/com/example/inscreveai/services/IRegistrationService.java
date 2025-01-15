package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.RegistrationDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IRegistrationService {

    RegistrationDTO updateDTO(Long id, RegistrationDTO registrationAtualizado);

    RegistrationDTO saveDTO(RegistrationDTO dto);

    List<RegistrationDTO> findAllDTO();

    Page<RegistrationDTO> findAllPageAsDTO(Pageable pageable);

    RegistrationDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
