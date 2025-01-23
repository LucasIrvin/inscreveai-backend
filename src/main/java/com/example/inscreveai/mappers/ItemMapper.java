package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Item;
import com.example.inscreveai.models.dto.ItemDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class ItemMapper implements EntityMapper<ItemDTO, Item> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        ItemMapper.mapper = mapper;
    }

    @Override
    public Item toEntity(ItemDTO itemDTO) {
        return mapper.map(itemDTO, Item.class);
    }

    @Override
    public ItemDTO toDto(Item item) {
        return mapper.map(item, ItemDTO.class);
    }

    @Override
    public List<Item> toEntity(List<ItemDTO> itemDTOList) {
        return itemDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ItemDTO> toDto(List<Item> itemList) {
        return itemList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
