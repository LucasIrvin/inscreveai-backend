package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.ExtractMapper;
import com.example.inscreveai.models.Extract;
import com.example.inscreveai.models.dto.ExtractDTO;
import com.example.inscreveai.repository.ExtractRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IExtractService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class ExtractService extends GenericService<Extract, Long, ExtractDTO> implements IExtractService {

    public ExtractService(ExtractRepository repository, ExtractMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<ExtractDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
