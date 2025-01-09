package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.ProgrammingMapper;
import com.example.inscreveai.models.Programming;
import com.example.inscreveai.models.dto.ProgrammingDTO;
import com.example.inscreveai.repository.ProgrammingRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IProgrammingService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class ProgrammingService extends GenericService<Programming, Long, ProgrammingDTO> implements IProgrammingService {

    public ProgrammingService(ProgrammingRepository repository, ProgrammingMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<ProgrammingDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
