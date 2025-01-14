package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Answers;
import com.example.inscreveai.models.Discount;
import com.example.inscreveai.models.dto.AnswersDTO;
import com.example.inscreveai.models.dto.DiscountDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class DiscountMapper implements EntityMapper<DiscountDTO, Discount> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        DiscountMapper.mapper = mapper;
    }

    @Override
    public Discount toEntity(DiscountDTO discountDTO) {
        return mapper.map(discountDTO, Discount.class);
    }

    @Override
    public DiscountDTO toDto(Discount discount) {
        return mapper.map(discount, DiscountDTO.class);
    }

    @Override
    public List<Discount> toEntity(List<DiscountDTO> discountDTOList) {
        return discountDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<DiscountDTO> toDto(List<Discount> discountList) {
        return discountList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
