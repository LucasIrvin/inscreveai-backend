package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.PanelistMapper;
import com.example.inscreveai.models.Panelist;
import com.example.inscreveai.models.dto.PanelistDTO;
import com.example.inscreveai.repository.PanelistRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IPanelistService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class PanelistService extends GenericService<Panelist, Long, PanelistDTO> implements IPanelistService{

    public PanelistService(PanelistRepository repository, PanelistMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<PanelistDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
