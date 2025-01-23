package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.TransactionItemMapper;
import com.example.inscreveai.models.TransactionItem;
import com.example.inscreveai.models.dto.TransactionItemDTO;
import com.example.inscreveai.repository.TransactionItemRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ITransactionItemService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class TransactionItemService extends GenericService<TransactionItem, Long, TransactionItemDTO> implements ITransactionItemService {

    public TransactionItemService(TransactionItemRepository repository, TransactionItemMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public Page<TransactionItemDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
