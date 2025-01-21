package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Movement;
import com.example.inscreveai.models.dto.MovementDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class MovementMapper implements EntityMapper<MovementDTO, Movement>{

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        MovementMapper.mapper = mapper;
    }

    @Override
    public Movement toEntity(MovementDTO movementDTO) {
        return mapper.map(movementDTO, Movement.class);
    }

    @Override
    public MovementDTO toDto(Movement movement) {
        return mapper.map(movement, MovementDTO.class);
    }

    @Override
    public List<Movement> toEntity(List<MovementDTO> movementDTOList) {
        return movementDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<MovementDTO> toDto(List<Movement> movementList) {
        return movementList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
