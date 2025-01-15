package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.About;
import com.example.inscreveai.models.dto.AboutDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class AboutMapper implements EntityMapper<AboutDTO, About> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        AboutMapper.mapper = mapper;
    }

    @Override
    public About toEntity(AboutDTO aboutDTO) {
        return mapper.map(aboutDTO, About.class);
    }

    @Override
    public AboutDTO toDto(About about) {
        return mapper.map(about, AboutDTO.class);
    }

    @Override
    public List<About> toEntity(List<AboutDTO> aboutDTOList) {
        return aboutDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<AboutDTO> toDto(List<About> aboutList) {
        return aboutList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
