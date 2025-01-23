package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.DiscountApplied;
import com.example.inscreveai.models.dto.DiscountAppliedDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class DiscountAppliedMapper implements EntityMapper<DiscountAppliedDTO, DiscountApplied> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        DiscountAppliedMapper.mapper = mapper;
    }

    @Override
    public DiscountApplied toEntity(DiscountAppliedDTO discountAppliedDTO) {
        return mapper.map(discountAppliedDTO, DiscountApplied.class);
    }

    @Override
    public DiscountAppliedDTO toDto(DiscountApplied discountApplied) {
        return mapper.map(discountApplied, DiscountAppliedDTO.class);
    }

    @Override
    public List<DiscountApplied> toEntity(List<DiscountAppliedDTO> discountAppliedDTOList) {
        return discountAppliedDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<DiscountAppliedDTO> toDto(List<DiscountApplied> discountAppliedList) {
        return discountAppliedList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
