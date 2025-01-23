package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Extract;
import com.example.inscreveai.models.dto.ExtractDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class ExtractMapper implements EntityMapper<ExtractDTO, Extract> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        ExtractMapper.mapper = mapper;
    }

    @Override
    public Extract toEntity(ExtractDTO extractDTO) {
        return mapper.map(extractDTO, Extract.class);
    }

    @Override
    public ExtractDTO toDto(Extract extract) {
        return mapper.map(extract, ExtractDTO.class);
    }

    @Override
    public List<Extract> toEntity(List<ExtractDTO> extractDTOList) {
        return extractDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ExtractDTO> toDto(List<Extract> extractList) {
        return extractList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
