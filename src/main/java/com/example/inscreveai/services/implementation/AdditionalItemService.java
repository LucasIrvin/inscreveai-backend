package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.AdditionalItemMapper;
import com.example.inscreveai.models.AdditionalItem;
import com.example.inscreveai.models.dto.AdditionalItemDTO;
import com.example.inscreveai.repository.AdditionalItemRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IAdditionalItemService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class AdditionalItemService extends GenericService<AdditionalItem, Long, AdditionalItemDTO> implements IAdditionalItemService {

    public AdditionalItemService(AdditionalItemRepository repository, AdditionalItemMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<AdditionalItemDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
