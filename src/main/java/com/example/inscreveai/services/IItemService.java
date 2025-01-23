package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.ItemDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IItemService {

    ItemDTO updateDTO(Long id, ItemDTO itemAtualizado);

    ItemDTO saveDTO(ItemDTO dto);

    List<ItemDTO> findAllDTO();

    Page<ItemDTO> findAllPageAsDTO(Pageable pageable);

    ItemDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
