package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.PaymentDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IPaymentService {

    PaymentDTO updateDTO(Long id, PaymentDTO paymentAtualizado);

    PaymentDTO saveDTO(PaymentDTO dto);

    List<PaymentDTO> findAllDTO();

    Page<PaymentDTO> findAllPageAsDTO(Pageable pageable);

    PaymentDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
