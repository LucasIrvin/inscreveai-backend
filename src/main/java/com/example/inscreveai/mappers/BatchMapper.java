package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Batch;
import com.example.inscreveai.models.dto.BatchDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class BatchMapper implements EntityMapper<BatchDTO, Batch> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        BatchMapper.mapper = mapper;
    }

    @Override
    public Batch toEntity(BatchDTO batchDTO) {
        return mapper.map(batchDTO, Batch.class);
    }

    @Override
    public BatchDTO toDto(Batch batch) {
        return mapper.map(batch, BatchDTO.class);
    }

    @Override
    public List<Batch> toEntity(List<BatchDTO> batchDTOList) {
        return batchDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<BatchDTO> toDto(List<Batch> answersList) {
        return answersList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
