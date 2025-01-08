package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.CancellationPolicyDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ICancellationPolicyService {

    CancellationPolicyDTO updateDTO(Long id, CancellationPolicyDTO cancellationPolicyAtualizado);

    CancellationPolicyDTO saveDTO(CancellationPolicyDTO dto);

    List<CancellationPolicyDTO> findAllDTO();

    Page<CancellationPolicyDTO> findAllPageAsDTO(Pageable pageable);

    CancellationPolicyDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);


}
