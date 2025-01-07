package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.WithdrawalAccountMapper;
import com.example.inscreveai.models.WithdrawalAccount;
import com.example.inscreveai.models.dto.WithdrawalAccountDTO;
import com.example.inscreveai.repository.WithdrawalAccountRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IWithdrawalAccountService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class WithdrawalAccountServiceService extends GenericService<WithdrawalAccount, Long, WithdrawalAccountDTO> implements IWithdrawalAccountService {

   public WithdrawalAccountServiceService(WithdrawalAccountRepository repository, WithdrawalAccountMapper mapper){
       super (repository, mapper);
   }

    @Override
    public Page<WithdrawalAccountDTO> findAllPageAsDto(Pageable pageable) {
        return null;
    }
}
