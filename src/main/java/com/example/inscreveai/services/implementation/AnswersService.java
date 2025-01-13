package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.AnswersMapper;
import com.example.inscreveai.models.Answers;
import com.example.inscreveai.models.dto.AnswersDTO;
import com.example.inscreveai.repository.AnswersRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IAnswersService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class AnswersService extends GenericService<Answers, Long, AnswersDTO> implements IAnswersService {

    public AnswersService(AnswersRepository repository, AnswersMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<AnswersDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
