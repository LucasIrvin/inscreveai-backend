package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.EventMapper;
import com.example.inscreveai.models.Event;
import com.example.inscreveai.models.dto.EventDTO;
import com.example.inscreveai.repository.EventRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IEventService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class EventService extends GenericService<Event, Long, EventDTO> implements IEventService {

    public EventService(EventRepository repository, EventMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<EventDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
