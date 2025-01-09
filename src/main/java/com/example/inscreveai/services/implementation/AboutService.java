package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.AboutMapper;
import com.example.inscreveai.models.About;
import com.example.inscreveai.models.dto.AboutDTO;
import com.example.inscreveai.repository.AboutRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IAboutService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class AboutService extends GenericService<About, Long, AboutDTO> implements IAboutService{

    public AboutService(AboutRepository repository, AboutMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<AboutDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
