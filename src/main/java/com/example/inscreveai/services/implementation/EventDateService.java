package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.EventDateMapper;
import com.example.inscreveai.models.EventDate;
import com.example.inscreveai.models.dto.EventDateDTO;
import com.example.inscreveai.repository.EventDateRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IEventDateService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class EventDateService extends GenericService<EventDate, Long, EventDateDTO> implements IEventDateService {

    public EventDateService(EventDateRepository repository, EventDateMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<EventDateDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
