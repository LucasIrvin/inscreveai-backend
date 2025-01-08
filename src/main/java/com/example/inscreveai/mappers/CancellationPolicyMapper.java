package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.CancellationPolicy;
import com.example.inscreveai.models.dto.CancellationPolicyDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan

public class CancellationPolicyMapper implements EntityMapper<CancellationPolicyDTO, CancellationPolicy> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        CancellationPolicyMapper.mapper = mapper;
    }

    @Override
    public CancellationPolicy toEntity(CancellationPolicyDTO cancellationPolicyDTO) {
        return mapper.map(cancellationPolicyDTO, CancellationPolicy.class);
    }

    @Override
    public CancellationPolicyDTO toDto(CancellationPolicy cancellationPolicy) {
        return mapper.map(cancellationPolicy, CancellationPolicyDTO.class);
    }

    @Override
    public List<CancellationPolicy> toEntity(List<CancellationPolicyDTO> cancellationPolicyDTOList) {
        return cancellationPolicyDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<CancellationPolicyDTO> toDto(List<CancellationPolicy> cancellationPolicyList) {
        return cancellationPolicyList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }



}
