package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Programming;
import com.example.inscreveai.models.dto.ProgrammingDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class ProgrammingMapper implements EntityMapper<ProgrammingDTO, Programming> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        ProgrammingMapper.mapper = mapper;
    }

    @Override
    public Programming toEntity(ProgrammingDTO programmingDTO) {
        return mapper.map(programmingDTO, Programming.class);
    }

    @Override
    public ProgrammingDTO toDto(Programming programming) {
        return mapper.map(programming, ProgrammingDTO.class);
    }

    @Override
    public List<Programming> toEntity(List<ProgrammingDTO> programmingDTOList) {
        return programmingDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProgrammingDTO> toDto(List<Programming> programmingList) {
        return programmingList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
