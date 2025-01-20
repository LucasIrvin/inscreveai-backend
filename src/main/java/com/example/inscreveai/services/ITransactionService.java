package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.TransactionDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ITransactionService {

    TransactionDTO updateDTO(Long id, TransactionDTO transactionAtualizado);

    TransactionDTO saveDTO(TransactionDTO dto);

    List<TransactionDTO> findAllDTO();

    TransactionDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

    Page<TransactionDTO> findAllPageAsDTO(Pageable pageable);
}
