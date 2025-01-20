package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.OutboxMapper;
import com.example.inscreveai.models.Outbox;
import com.example.inscreveai.models.dto.OutboxDTO;
import com.example.inscreveai.repository.OutboxRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IOutboxService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class OutboxService extends GenericService<Outbox, Long, OutboxDTO> implements IOutboxService {

    public OutboxService(OutboxRepository repository, OutboxMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public Page<OutboxDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
