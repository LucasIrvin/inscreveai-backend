package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.EventPage;
import com.example.inscreveai.models.dto.EventPageDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class EventPageMapper implements EntityMapper<EventPageDTO, EventPage> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        EventPageMapper.mapper = mapper;
    }

    @Override
    public EventPage toEntity(EventPageDTO eventPageDTO) {
        return mapper.map(eventPageDTO, EventPage.class);
    }

    @Override
    public EventPageDTO toDto(EventPage eventPage) {
        return mapper.map(eventPage, EventPageDTO.class);
    }

    @Override
    public List<EventPage> toEntity(List<EventPageDTO> eventPageDTOList) {
        return eventPageDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<EventPageDTO> toDto(List<EventPage> eventPageList) {
        return eventPageList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
