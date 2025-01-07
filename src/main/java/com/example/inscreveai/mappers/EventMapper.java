package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Event;
import com.example.inscreveai.models.dto.EventDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class EventMapper implements EntityMapper<EventDTO, Event> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        EventMapper.mapper = mapper;
    }

    @Override
    public Event toEntity(EventDTO eventDTO) {
        return mapper.map(eventDTO, Event.class);
    }

    @Override
    public EventDTO toDto(Event event) {
        return mapper.map(event, EventDTO.class);
    }

    @Override
    public List<Event> toEntity(List<EventDTO> eventDTOList) {
        return eventDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<EventDTO> toDto(List<Event> eventList) {
        return eventList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
