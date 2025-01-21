package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.MovementMapper;
import com.example.inscreveai.models.Movement;
import com.example.inscreveai.models.dto.MovementDTO;
import com.example.inscreveai.repository.MovementRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IMovementService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class MovementService extends GenericService<Movement, Long, MovementDTO> implements IMovementService {

    public MovementService(MovementRepository repository, MovementMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<MovementDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
