package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.FormMapper;
import com.example.inscreveai.models.Form;
import com.example.inscreveai.models.dto.FormDTO;
import com.example.inscreveai.repository.FormRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IFormService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class FormService extends GenericService<Form, Long, FormDTO> implements IFormService {

    public FormService(FormRepository repository, FormMapper mapper){
        super(repository, mapper);
    }

    @Override
    public Page<FormDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
