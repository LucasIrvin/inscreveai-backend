package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Form;
import com.example.inscreveai.models.dto.FormDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class FormMapper implements EntityMapper<FormDTO, Form> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        FormMapper.mapper = mapper;
    }

    @Override
    public Form toEntity(FormDTO formDTO) {
        return mapper.map(formDTO, Form.class);
    }

    @Override
    public FormDTO toDto(Form form) {
        return mapper.map(form, FormDTO.class);
    }

    @Override
    public List<Form> toEntity(List<FormDTO> formDTOList) {
        return formDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<FormDTO> toDto(List<Form> formList) {
        return formList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
