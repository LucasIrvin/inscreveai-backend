package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Person;
import com.example.inscreveai.models.dto.PersonDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class PersonMapper implements EntityMapper<PersonDTO, Person> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        PersonMapper.mapper = mapper;
    }

    @Override
    public Person toEntity(PersonDTO personDTO) {
        return mapper.map(personDTO, Person.class);
    }

    @Override
    public PersonDTO toDto(Person person) {
        return mapper.map(person, PersonDTO.class);
    }

    @Override
    public List<Person> toEntity(List<PersonDTO> personDTOList) {
        return personDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonDTO> toDto(List<Person> personList) {
        return personList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


}
