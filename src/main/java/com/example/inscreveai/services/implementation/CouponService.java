package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.CouponMapper;
import com.example.inscreveai.models.Coupon;
import com.example.inscreveai.models.dto.CouponDTO;
import com.example.inscreveai.repository.CouponRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ICouponService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class CouponService extends GenericService<Coupon, Long, CouponDTO> implements ICouponService {

    public CouponService(CouponRepository repository, CouponMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<CouponDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
