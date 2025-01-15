package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Location;
import com.example.inscreveai.models.dto.LocationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class LocationMapper implements EntityMapper<LocationDTO, Location>{

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        LocationMapper.mapper = mapper;
    }

    @Override
    public Location toEntity(LocationDTO locationDTO) {
        return mapper.map(locationDTO, Location.class);
    }

    @Override
    public LocationDTO toDto(Location location) {
        return mapper.map(location, LocationDTO.class);
    }

    @Override
    public List<Location> toEntity(List<LocationDTO> locationDTOList) {
        return locationDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<LocationDTO> toDto(List<Location> locationList) {
        return locationList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }



}
