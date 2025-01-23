package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.ChargeDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IChargeService {

    ChargeDTO updateDTO(Long id, ChargeDTO chargeAtualizado);

    ChargeDTO saveDTO(ChargeDTO dto);

    List<ChargeDTO> findAllDTO();

    Page<ChargeDTO> findAllPageAsDTO(Pageable pageable);

    ChargeDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
