package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.CategoryMapper;
import com.example.inscreveai.models.Category;
import com.example.inscreveai.models.dto.CategoryDTO;
import com.example.inscreveai.repository.CategoryRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ICategoryService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class CategoryService extends GenericService<Category, Long, CategoryDTO> implements ICategoryService{

    public CategoryService(CategoryRepository repository, CategoryMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<CategoryDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
