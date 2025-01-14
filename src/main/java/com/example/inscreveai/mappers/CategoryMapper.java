package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Category;
import com.example.inscreveai.models.dto.CategoryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class CategoryMapper implements EntityMapper<CategoryDTO, Category> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        CategoryMapper.mapper = mapper;
    }

    @Override
    public Category toEntity(CategoryDTO categoryDTO) {
        return mapper.map(categoryDTO, Category.class);
    }

    @Override
    public CategoryDTO toDto(Category category) {
        return mapper.map(category, CategoryDTO.class);
    }

    @Override
    public List<Category> toEntity(List<CategoryDTO> categoryDTOList) {
        return categoryDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<CategoryDTO> toDto(List<Category> categoryList) {
        return categoryList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
