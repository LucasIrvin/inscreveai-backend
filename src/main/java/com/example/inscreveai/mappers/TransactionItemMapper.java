package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.TransactionItem;
import com.example.inscreveai.models.dto.TransactionItemDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class TransactionItemMapper implements EntityMapper<TransactionItemDTO, TransactionItem> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        TransactionItemMapper.mapper = mapper;
    }

    @Override
    public TransactionItem toEntity(TransactionItemDTO transactionItemDTO) {
        return mapper.map(transactionItemDTO, TransactionItem.class);
    }

    @Override
    public TransactionItemDTO toDto(TransactionItem transactionItem) {
        return mapper.map(transactionItem, TransactionItemDTO.class);
    }

    @Override
    public List<TransactionItem> toEntity(List<TransactionItemDTO> transactionItemDTOList) {
        return transactionItemDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<TransactionItemDTO> toDto(List<TransactionItem> transactionItemList) {
        return transactionItemList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
