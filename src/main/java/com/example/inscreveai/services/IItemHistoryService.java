package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.ItemHistoryDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IItemHistoryService {

    ItemHistoryDTO updateDTO(Long id, ItemHistoryDTO itemHistoryAtualizado);

    ItemHistoryDTO saveDTO(ItemHistoryDTO dto);

    List<ItemHistoryDTO> findAllDTO();

    Page<ItemHistoryDTO> findAllPageAsDTO(Pageable pageable);

    ItemHistoryDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
