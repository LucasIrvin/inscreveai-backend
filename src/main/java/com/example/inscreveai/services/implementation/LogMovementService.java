package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.LogMovementMapper;
import com.example.inscreveai.models.LogMovement;
import com.example.inscreveai.models.dto.LogMovementDTO;
import com.example.inscreveai.repository.LogMovementRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ILogMovementService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class LogMovementService extends GenericService<LogMovement, Long, LogMovementDTO> implements ILogMovementService {

    public LogMovementService(LogMovementRepository repository, LogMovementMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<LogMovementDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
