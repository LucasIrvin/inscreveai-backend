package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Charge;
import com.example.inscreveai.models.dto.ChargeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class ChargeMapper implements EntityMapper<ChargeDTO, Charge> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        ChargeMapper.mapper = mapper;
    }

    @Override
    public Charge toEntity(ChargeDTO chargeDTO) {
        return mapper.map(chargeDTO, Charge.class);
    }

    @Override
    public ChargeDTO toDto(Charge charge) {
        return mapper.map(charge, ChargeDTO.class);
    }

    @Override
    public List<Charge> toEntity(List<ChargeDTO> chargeDTOList) {
        return chargeDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ChargeDTO> toDto(List<Charge> chargeList) {
        return chargeList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
