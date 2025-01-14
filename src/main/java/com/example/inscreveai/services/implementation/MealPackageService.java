package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.MealPackageMapper;
import com.example.inscreveai.models.MealPackage;
import com.example.inscreveai.models.dto.MealPackageDTO;
import com.example.inscreveai.repository.MealPackageRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IMealPackageService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class MealPackageService extends GenericService<MealPackage, Long, MealPackageDTO> implements IMealPackageService {

    public MealPackageService(MealPackageRepository repository, MealPackageMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<MealPackageDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
