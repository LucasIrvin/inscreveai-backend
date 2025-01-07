package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.WithdrawalAccountDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IWithdrawalAccountService {

    WithdrawalAccountDTO updateDTO(Long id, WithdrawalAccountDTO withdrawalAccountAtualizado);

    WithdrawalAccountDTO saveDTO(WithdrawalAccountDTO dto);

    List<WithdrawalAccountDTO> findAllDTO();

    Page<WithdrawalAccountDTO> findAllPageAsDto(Pageable pageable);

    WithdrawalAccountDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
