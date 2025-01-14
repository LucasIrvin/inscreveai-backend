package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.MealPackage;
import com.example.inscreveai.models.dto.MealPackageDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class MealPackageMapper implements EntityMapper<MealPackageDTO, MealPackage> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        MealPackageMapper.mapper = mapper;
    }

    @Override
    public MealPackage toEntity(MealPackageDTO mealPackageDTO) {
        return mapper.map(mealPackageDTO, MealPackage.class);
    }

    @Override
    public MealPackageDTO toDto(MealPackage mealPackage) {
        return mapper.map(mealPackage, MealPackageDTO.class);
    }

    @Override
    public List<MealPackage> toEntity(List<MealPackageDTO> mealPackageDTOList) {
        return mealPackageDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<MealPackageDTO> toDto(List<MealPackage> mealPackageList) {
        return mealPackageList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
