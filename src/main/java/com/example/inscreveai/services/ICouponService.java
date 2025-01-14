package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.CouponDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ICouponService {

    CouponDTO updateDTO(Long id, CouponDTO couponAtualizado);

    CouponDTO saveDTO(CouponDTO dto);

    List<CouponDTO> findAllDTO();

    Page<CouponDTO> findAllPageAsDTO(Pageable pageable);

    CouponDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
