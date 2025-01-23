package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.ChargeMapper;
import com.example.inscreveai.models.Charge;
import com.example.inscreveai.models.dto.ChargeDTO;
import com.example.inscreveai.repository.ChargeRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IChargeService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class ChargeService extends GenericService<Charge, Long, ChargeDTO> implements IChargeService {

    public ChargeService(ChargeRepository repository, ChargeMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<ChargeDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
