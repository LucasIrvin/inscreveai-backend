package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.BatchDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IBatchService {

    BatchDTO updateDTO(Long id, BatchDTO batchAtualizado);

    BatchDTO saveDTO(BatchDTO dto);

    List<BatchDTO> findAllDTO();

    Page<BatchDTO> findAllPageAsDTO(Pageable pageable);

    BatchDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
