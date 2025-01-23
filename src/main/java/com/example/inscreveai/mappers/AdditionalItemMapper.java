package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.AdditionalItem;
import com.example.inscreveai.models.dto.AdditionalItemDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class AdditionalItemMapper implements EntityMapper<AdditionalItemDTO, AdditionalItem> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        AdditionalItemMapper.mapper = mapper;
    }

    @Override
    public AdditionalItem toEntity(AdditionalItemDTO additionalItemDTO) {
        return mapper.map(additionalItemDTO, AdditionalItem.class);
    }

    @Override
    public AdditionalItemDTO toDto(AdditionalItem additionalItem) {
        return mapper.map(additionalItem, AdditionalItemDTO.class);
    }

    @Override
    public List<AdditionalItem> toEntity(List<AdditionalItemDTO> additionalItemDTOList) {
        return additionalItemDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdditionalItemDTO> toDto(List<AdditionalItem> additionalItemList) {
        return additionalItemList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }







}
