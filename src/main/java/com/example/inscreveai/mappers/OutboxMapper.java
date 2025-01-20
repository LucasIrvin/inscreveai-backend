package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Outbox;
import com.example.inscreveai.models.dto.OutboxDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class OutboxMapper implements EntityMapper<OutboxDTO, Outbox> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        OutboxMapper.mapper = mapper;
    }

    @Override
    public Outbox toEntity(OutboxDTO outboxDTO) {
        return mapper.map(outboxDTO, Outbox.class);
    }

    @Override
    public OutboxDTO toDto(Outbox outbox) {
        return mapper.map(outbox, OutboxDTO.class);
    }

    @Override
    public List<Outbox> toEntity(List<OutboxDTO> outboxDTOList) {
        return outboxDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<OutboxDTO> toDto(List<Outbox> outboxList) {
        return outboxList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
