package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.RegistrationMapper;
import com.example.inscreveai.models.Registration;
import com.example.inscreveai.models.dto.RegistrationDTO;
import com.example.inscreveai.repository.RegistrationRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IRegistrationService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class RegistrationService extends GenericService<Registration, Long, RegistrationDTO> implements IRegistrationService {

    public RegistrationService(RegistrationRepository repository, RegistrationMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public Page<RegistrationDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
