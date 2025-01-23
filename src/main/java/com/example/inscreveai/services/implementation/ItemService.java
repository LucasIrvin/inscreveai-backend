package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.ItemMapper;
import com.example.inscreveai.models.Item;
import com.example.inscreveai.models.dto.ItemDTO;
import com.example.inscreveai.repository.ItemRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IItemService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class ItemService extends GenericService<Item, Long, ItemDTO> implements IItemService {

    public ItemService(ItemRepository repository, ItemMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<ItemDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
