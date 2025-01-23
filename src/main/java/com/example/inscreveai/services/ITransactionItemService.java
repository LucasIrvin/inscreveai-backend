package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.TransactionItemDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ITransactionItemService {

    TransactionItemDTO updateDTO(Long id, TransactionItemDTO transactionItemAtualizado);

    TransactionItemDTO saveDTO(TransactionItemDTO dto);

    List<TransactionItemDTO> findAllDTO();

    Page<TransactionItemDTO> findAllPageAsDTO(Pageable pageable);

    TransactionItemDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
