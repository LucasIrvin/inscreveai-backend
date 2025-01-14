package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Meal;
import com.example.inscreveai.models.dto.MealDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class MealMapper implements EntityMapper<MealDTO, Meal> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        MealMapper.mapper = mapper;
    }

    @Override
    public Meal toEntity(MealDTO mealDTO) {
        return mapper.map(mealDTO, Meal.class);
    }

    @Override
    public MealDTO toDto(Meal meal) {
        return mapper.map(meal, MealDTO.class);
    }

    @Override
    public List<Meal> toEntity(List<MealDTO> mealDTOList){
        return mealDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<MealDTO> toDto(List<Meal> mealList) {
        return mealList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
