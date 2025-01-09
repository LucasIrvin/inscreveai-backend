package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Panelist;
import com.example.inscreveai.models.dto.PanelistDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class PanelistMapper implements EntityMapper<PanelistDTO, Panelist> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        PanelistMapper.mapper = mapper;
    }

    @Override
    public Panelist toEntity(PanelistDTO panelistDTO) {
        return mapper.map(panelistDTO, Panelist.class);
    }

    @Override
    public PanelistDTO toDto(Panelist panelist) {
        return mapper.map(panelist, PanelistDTO.class);
    }

    @Override
    public List<Panelist> toEntity(List<PanelistDTO> panelistDTOList) {
        return panelistDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<PanelistDTO> toDto(List<Panelist> panelistList) {
        return panelistList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
