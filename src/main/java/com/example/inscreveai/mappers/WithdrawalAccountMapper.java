package com.example.inscreveai.mappers;


import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.WithdrawalAccount;
import com.example.inscreveai.models.dto.WithdrawalAccountDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class WithdrawalAccountMapper implements EntityMapper<WithdrawalAccountDTO, WithdrawalAccount> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        WithdrawalAccountMapper.mapper = mapper;
    }

    @Override
    public WithdrawalAccount toEntity(WithdrawalAccountDTO withdrawalAccountDTO) {
        return mapper.map(withdrawalAccountDTO, WithdrawalAccount.class);
    }

    @Override
    public WithdrawalAccountDTO toDto(WithdrawalAccount withdrawalAccount) {
        return mapper.map(withdrawalAccount, WithdrawalAccountDTO.class);
    }


    @Override
    public List<WithdrawalAccount> toEntity(List<WithdrawalAccountDTO> withdrawalAccountDTOList) {
        return withdrawalAccountDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<WithdrawalAccountDTO> toDto(List<WithdrawalAccount> withdrawalAccountList) {
        return withdrawalAccountList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
