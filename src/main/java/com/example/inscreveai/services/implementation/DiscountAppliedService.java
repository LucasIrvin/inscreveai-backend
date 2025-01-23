package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.DiscountAppliedMapper;
import com.example.inscreveai.models.DiscountApplied;
import com.example.inscreveai.models.dto.DiscountAppliedDTO;
import com.example.inscreveai.repository.DiscountAppliedRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IDiscountAppliedService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class DiscountAppliedService extends GenericService<DiscountApplied, Long, DiscountAppliedDTO> implements IDiscountAppliedService {

    public DiscountAppliedService(DiscountAppliedRepository repository, DiscountAppliedMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<DiscountAppliedDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
