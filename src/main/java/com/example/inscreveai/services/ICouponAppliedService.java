package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.CouponAppliedDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ICouponAppliedService {

    CouponAppliedDTO updateDTO(Long id, CouponAppliedDTO couponAppliedAtualizado);

    CouponAppliedDTO saveDTO(CouponAppliedDTO dto);

    List<CouponAppliedDTO> findAllDTO();

    Page<CouponAppliedDTO> findAllPageAsDTO(Pageable pageable);

    CouponAppliedDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
