package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.CapMapper;
import com.example.inscreveai.models.Cap;
import com.example.inscreveai.models.dto.CapDTO;
import com.example.inscreveai.repository.CapRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ICapService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class CapService extends GenericService<Cap, Long, CapDTO> implements ICapService{

    public CapService(CapRepository repository, CapMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<CapDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
