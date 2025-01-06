package com.example.inscreveai.services.implementation;


import com.example.inscreveai.mappers.PersonMapper;
import com.example.inscreveai.models.Person;
import com.example.inscreveai.models.dto.PersonDTO;
import com.example.inscreveai.repository.PersonRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IPersonService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public  class PersonService extends GenericService<Person, Long, PersonDTO> implements IPersonService {

    public PersonService(PersonRepository repository, PersonMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Page<PersonDTO> findAllPageAsDTO(Pageable pageable) {
        return null;
    }
}
