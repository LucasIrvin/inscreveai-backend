package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Payment;
import com.example.inscreveai.models.dto.PaymentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class PaymentMapper implements EntityMapper<PaymentDTO, Payment> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        PaymentMapper.mapper = mapper;
    }

    @Override
    public Payment toEntity(PaymentDTO paymentDTO) {
        return mapper.map(paymentDTO, Payment.class);
    }

    @Override
    public PaymentDTO toDto(Payment payment) {
        return mapper.map(payment, PaymentDTO.class);
    }

    @Override
    public List<Payment> toEntity(List<PaymentDTO> paymentDTOList) {
        return paymentDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<PaymentDTO> toDto(List<Payment> paymentList) {
        return paymentList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
