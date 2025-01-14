package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.BatchMapper;
import com.example.inscreveai.models.Batch;
import com.example.inscreveai.models.dto.BatchDTO;
import com.example.inscreveai.repository.BatchRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IBatchService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class BatchService extends GenericService<Batch, Long, BatchDTO> implements IBatchService {

    public BatchService(BatchRepository repository, BatchMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<BatchDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
