package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.CouponApplied;
import com.example.inscreveai.models.dto.CouponAppliedDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class CouponAppliedMapper implements EntityMapper<CouponAppliedDTO, CouponApplied> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        CouponAppliedMapper.mapper = mapper;
    }

    @Override
    public CouponApplied toEntity(CouponAppliedDTO couponAppliedDTO) {
        return mapper.map(couponAppliedDTO, CouponApplied.class);
    }

    @Override
    public CouponAppliedDTO toDto(CouponApplied couponApplied) {
        return mapper.map(couponApplied, CouponAppliedDTO.class);
    }

    @Override
    public List<CouponApplied> toEntity(List<CouponAppliedDTO> couponAppliedDTOList) {
        return couponAppliedDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<CouponAppliedDTO> toDto(List<CouponApplied> couponAppliedList) {
        return couponAppliedList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
