package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.DiscountMapper;
import com.example.inscreveai.models.Discount;
import com.example.inscreveai.models.dto.DiscountDTO;
import com.example.inscreveai.repository.DiscountRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IDiscountService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class DiscountService extends GenericService<Discount, Long, DiscountDTO> implements IDiscountService {

    public DiscountService(DiscountRepository repository, DiscountMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<DiscountDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
