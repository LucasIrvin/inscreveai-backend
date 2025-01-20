package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Category;
import com.example.inscreveai.models.Inbox;
import com.example.inscreveai.models.dto.CategoryDTO;
import com.example.inscreveai.models.dto.InboxDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class InboxMapper implements EntityMapper<InboxDTO, Inbox> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        InboxMapper.mapper = mapper;
    }

    @Override
    public Inbox toEntity(InboxDTO inboxDTO) {
        return mapper.map(inboxDTO, Inbox.class);
    }

    @Override
    public InboxDTO toDto(Inbox inbox) {
        return mapper.map(inbox, InboxDTO.class);
    }

    @Override
    public List<Inbox> toEntity(List<InboxDTO> inboxDTOList) {
        return inboxDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<InboxDTO> toDto(List<Inbox> inboxList) {
        return inboxList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
