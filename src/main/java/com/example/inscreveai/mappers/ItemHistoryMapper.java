package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.ItemHistory;
import com.example.inscreveai.models.dto.ItemHistoryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class ItemHistoryMapper implements EntityMapper<ItemHistoryDTO, ItemHistory> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        ItemHistoryMapper.mapper = mapper;
    }

    @Override
    public ItemHistory toEntity(ItemHistoryDTO itemHistoryDTO) {
        return mapper.map(itemHistoryDTO, ItemHistory.class);
    }

    @Override
    public ItemHistoryDTO toDto(ItemHistory itemHistory) {
        return mapper.map(itemHistory, ItemHistoryDTO.class);
    }

    @Override
    public List<ItemHistory> toEntity(List<ItemHistoryDTO> itemHistoryDTOList) {
        return itemHistoryDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ItemHistoryDTO> toDto(List<ItemHistory> itemHistoryList) {
        return itemHistoryList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
