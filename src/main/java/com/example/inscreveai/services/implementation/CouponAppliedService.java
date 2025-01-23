package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.CouponAppliedMapper;
import com.example.inscreveai.models.CouponApplied;
import com.example.inscreveai.models.dto.CouponAppliedDTO;
import com.example.inscreveai.repository.CouponAppliedRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ICouponAppliedService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class CouponAppliedService extends GenericService<CouponApplied, Long, CouponAppliedDTO> implements ICouponAppliedService {

    public CouponAppliedService(CouponAppliedRepository repository, CouponAppliedMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<CouponAppliedDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
