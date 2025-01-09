package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.CancellationPolicy;
import com.example.inscreveai.models.Cap;
import com.example.inscreveai.models.dto.CancellationPolicyDTO;
import com.example.inscreveai.models.dto.CapDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class CapMapper implements EntityMapper<CapDTO, Cap> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        CapMapper.mapper = mapper;
    }

    @Override
    public Cap toEntity(CapDTO capDTO) {
        return mapper.map(capDTO, Cap.class);
    }

    @Override
    public CapDTO toDto(Cap cap) {
        return mapper.map(cap, CapDTO.class);
    }

    @Override
    public List<Cap> toEntity(List<CapDTO> capDTOList) {
        return capDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<CapDTO> toDto(List<Cap> capList) {
        return capList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
