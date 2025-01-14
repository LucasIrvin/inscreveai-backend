package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.MealMapper;
import com.example.inscreveai.models.Meal;
import com.example.inscreveai.models.dto.MealDTO;
import com.example.inscreveai.repository.MealRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IMealService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class MealService extends GenericService<Meal, Long, MealDTO> implements IMealService {

    public MealService(MealRepository repository, MealMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<MealDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
