package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.LogMovement;
import com.example.inscreveai.models.dto.LogMovementDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class LogMovementMapper implements EntityMapper<LogMovementDTO, LogMovement> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        LogMovementMapper.mapper = mapper;
    }

    @Override
    public LogMovement toEntity(LogMovementDTO logMovementDTO) {
        return mapper.map(logMovementDTO, LogMovement.class);
    }

    @Override
    public LogMovementDTO toDto(LogMovement logMovement) {
        return mapper.map(logMovement, LogMovementDTO.class);
    }

    @Override
    public List<LogMovement> toEntity(List<LogMovementDTO> logMovementDTOList) {
        return logMovementDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<LogMovementDTO> toDto(List<LogMovement> logMovementList) {
        return logMovementList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
