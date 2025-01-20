package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.InboxMapper;
import com.example.inscreveai.models.Inbox;
import com.example.inscreveai.models.dto.InboxDTO;
import com.example.inscreveai.repository.InboxRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IInboxService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class InboxService extends GenericService<Inbox, Long, InboxDTO> implements IInboxService {

    public InboxService(InboxRepository repository, InboxMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public Page<InboxDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
