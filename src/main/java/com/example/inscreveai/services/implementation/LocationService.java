package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.LocationMapper;
import com.example.inscreveai.models.Location;
import com.example.inscreveai.models.dto.LocationDTO;
import com.example.inscreveai.repository.LocationRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ILocationService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class LocationService extends GenericService<Location, Long, LocationDTO> implements ILocationService{

    public LocationService(LocationRepository repository, LocationMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<LocationDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
