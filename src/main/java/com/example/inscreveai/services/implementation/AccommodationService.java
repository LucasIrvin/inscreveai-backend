package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.AccommodationMapper;
import com.example.inscreveai.models.Accommodation;
import com.example.inscreveai.models.dto.AccommodationDTO;
import com.example.inscreveai.repository.AccommodationRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IAccommodationService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class AccommodationService extends GenericService<Accommodation, Long, AccommodationDTO> implements IAccommodationService {

    public AccommodationService(AccommodationRepository repository, AccommodationMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<AccommodationDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
