package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.EventPageMapper;
import com.example.inscreveai.models.EventPage;
import com.example.inscreveai.models.dto.EventPageDTO;
import com.example.inscreveai.repository.EventPageRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IEventPageService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class EventPageService extends GenericService<EventPage, Long, EventPageDTO> implements IEventPageService {

    public EventPageService(EventPageRepository repository, EventPageMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<EventPageDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
