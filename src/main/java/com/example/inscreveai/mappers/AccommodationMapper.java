package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Accommodation;
import com.example.inscreveai.models.dto.AccommodationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class AccommodationMapper implements EntityMapper<AccommodationDTO, Accommodation> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        AccommodationMapper.mapper = mapper;
    }

    @Override
    public Accommodation toEntity(AccommodationDTO accommodationDTO) {
        return mapper.map(accommodationDTO, Accommodation.class);
    }

    @Override
    public AccommodationDTO toDto(Accommodation accommodation) {
        return mapper.map(accommodation, AccommodationDTO.class);
    }

    @Override
    public List<Accommodation> toEntity(List<AccommodationDTO> accommodationDTOList) {
        return accommodationDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<AccommodationDTO> toDto(List<Accommodation> accommodationList) {
        return accommodationList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
