package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.ConfigMeals;
import com.example.inscreveai.models.dto.ConfigMealsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class ConfigMealsMapper implements EntityMapper<ConfigMealsDTO, ConfigMeals> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        ConfigMealsMapper.mapper = mapper;
    }

    @Override
    public ConfigMeals toEntity(ConfigMealsDTO configMealsDTO) {
        return mapper.map(configMealsDTO, ConfigMeals.class);
    }

    @Override
    public ConfigMealsDTO toDto(ConfigMeals configMeals) {
        return mapper.map(configMeals, ConfigMealsDTO.class);
    }

    @Override
    public List<ConfigMeals> toEntity(List<ConfigMealsDTO> configMealsDTOList) {
        return configMealsDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ConfigMealsDTO> toDto(List<ConfigMeals> configMealsList) {
        return configMealsList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
