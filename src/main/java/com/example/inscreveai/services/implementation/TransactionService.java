package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.TransactionMapper;
import com.example.inscreveai.models.Transaction;
import com.example.inscreveai.models.dto.TransactionDTO;
import com.example.inscreveai.repository.TransactionRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ITransactionService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class TransactionService extends GenericService<Transaction, Long, TransactionDTO> implements ITransactionService {

    public TransactionService(TransactionRepository repository, TransactionMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public Page<TransactionDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
