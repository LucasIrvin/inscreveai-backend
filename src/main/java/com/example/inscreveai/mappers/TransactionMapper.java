package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Transaction;
import com.example.inscreveai.models.dto.TransactionDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class TransactionMapper implements EntityMapper<TransactionDTO, Transaction> {

    static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        TransactionMapper.mapper = mapper;
    }

    @Override
    public Transaction toEntity(TransactionDTO transactionDTO) {
        return mapper.map(transactionDTO, Transaction.class);
    }

    @Override
    public TransactionDTO toDto(Transaction transaction) {
        return mapper.map(transaction, TransactionDTO.class);
    }


    @Override
    public List<Transaction> toEntity(List<TransactionDTO> transactionDTOList) {
        return transactionDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<TransactionDTO> toDto(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
