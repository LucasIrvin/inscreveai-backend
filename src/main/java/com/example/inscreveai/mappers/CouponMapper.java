package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Coupon;
import com.example.inscreveai.models.dto.CouponDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class CouponMapper implements EntityMapper<CouponDTO, Coupon> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        CouponMapper.mapper = mapper;
    }

    @Override
    public Coupon toEntity(CouponDTO couponDTO) {
        return mapper.map(couponDTO, Coupon.class);
    }

    @Override
    public CouponDTO toDto(Coupon coupon) {
        return mapper.map(coupon, CouponDTO.class);
    }

    @Override
    public List<Coupon> toEntity(List<CouponDTO> couponDTOList) {
        return couponDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<CouponDTO> toDto(List<Coupon> couponList) {
        return couponList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
