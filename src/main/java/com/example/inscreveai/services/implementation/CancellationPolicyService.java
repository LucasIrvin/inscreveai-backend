package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.CancellationPolicyMapper;
import com.example.inscreveai.models.CancellationPolicy;
import com.example.inscreveai.models.dto.CancellationPolicyDTO;
import com.example.inscreveai.repository.CancellationPolicyRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.ICancellationPolicyService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class CancellationPolicyService extends GenericService<CancellationPolicy, Long, CancellationPolicyDTO> implements ICancellationPolicyService {

    public CancellationPolicyService(CancellationPolicyRepository repository, CancellationPolicyMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<CancellationPolicyDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
