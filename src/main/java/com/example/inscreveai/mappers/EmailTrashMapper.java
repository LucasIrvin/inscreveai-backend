package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Category;
import com.example.inscreveai.models.EmailTrash;
import com.example.inscreveai.models.dto.CategoryDTO;
import com.example.inscreveai.models.dto.EmailTrashDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class EmailTrashMapper implements EntityMapper<EmailTrashDTO, EmailTrash> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        EmailTrashMapper.mapper = mapper;
    }

    @Override
    public EmailTrash toEntity(EmailTrashDTO emailTrashDTO) {
        return mapper.map(emailTrashDTO, EmailTrash.class);
    }

    @Override
    public EmailTrashDTO toDto(EmailTrash emailTrash) {
        return mapper.map(emailTrash, EmailTrashDTO.class);
    }

    @Override
    public List<EmailTrash> toEntity(List<EmailTrashDTO> emailTrashDTOList) {
        return emailTrashDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<EmailTrashDTO> toDto(List<EmailTrash> emailTrashes) {
        return emailTrashes.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
