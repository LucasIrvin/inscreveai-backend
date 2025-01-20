package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.EmailTrashMapper;
import com.example.inscreveai.models.EmailTrash;
import com.example.inscreveai.models.dto.EmailTrashDTO;
import com.example.inscreveai.repository.EmailTrashRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IEmailTrashService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class EmailTrashService extends GenericService<EmailTrash, Long, EmailTrashDTO> implements IEmailTrashService {

    public EmailTrashService(EmailTrashRepository repository, EmailTrashMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<EmailTrashDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
