package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Registration;
import com.example.inscreveai.models.dto.RegistrationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class RegistrationMapper implements EntityMapper<RegistrationDTO, Registration> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        RegistrationMapper.mapper = mapper;
    }

    @Override
    public Registration toEntity(RegistrationDTO registrationDTO) {
        return mapper.map(registrationDTO, Registration.class);
    }

    @Override
    public RegistrationDTO toDto(Registration registration) {
        return mapper.map(registration, RegistrationDTO.class);
    }

    @Override
    public List<Registration> toEntity(List<RegistrationDTO> registrationDTOList) {
        return registrationDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<RegistrationDTO> toDto(List<Registration> registrationList) {
        return registrationList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
