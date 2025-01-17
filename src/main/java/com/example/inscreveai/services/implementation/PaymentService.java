package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.PaymentMapper;
import com.example.inscreveai.models.Payment;
import com.example.inscreveai.models.dto.PaymentDTO;
import com.example.inscreveai.repository.PaymentRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IPaymentService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class PaymentService extends GenericService<Payment, Long, PaymentDTO> implements IPaymentService {

    public PaymentService(PaymentRepository repository, PaymentMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<PaymentDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
