package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.ItemHistoryMapper;
import com.example.inscreveai.models.ItemHistory;
import com.example.inscreveai.models.dto.ItemHistoryDTO;
import com.example.inscreveai.repository.ItemHistoryRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IItemHistoryService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class ItemHistoryService extends GenericService<ItemHistory, Long, ItemHistoryDTO> implements IItemHistoryService {

    public ItemHistoryService(ItemHistoryRepository repository, ItemHistoryMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<ItemHistoryDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
