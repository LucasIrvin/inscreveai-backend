package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.EventDate;
import com.example.inscreveai.models.dto.EventDateDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class EventDateMapper implements EntityMapper<EventDateDTO, EventDate> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        EventDateMapper.mapper = mapper;
    }

    @Override
    public EventDate toEntity(EventDateDTO eventDateDTO) {
        return mapper.map(eventDateDTO, EventDate.class);
    }

    @Override
    public EventDateDTO toDto(EventDate eventDate) {
        return mapper.map(eventDate, EventDateDTO.class);
    }

    @Override
    public List<EventDate> toEntity(List<EventDateDTO> eventDateDTOList) {
        return eventDateDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<EventDateDTO> toDto(List<EventDate> eventDateList) {
        return eventDateList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
