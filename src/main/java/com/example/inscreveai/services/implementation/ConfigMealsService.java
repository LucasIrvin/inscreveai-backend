package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.ConfigMealsMapper;
import com.example.inscreveai.models.ConfigMeals;
import com.example.inscreveai.models.dto.ConfigMealsDTO;
import com.example.inscreveai.repository.ConfigMealsRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IConfigMealsService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class ConfigMealsService extends GenericService<ConfigMeals, Long, ConfigMealsDTO> implements IConfigMealsService {

    public ConfigMealsService(ConfigMealsRepository repository, ConfigMealsMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<ConfigMealsDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
