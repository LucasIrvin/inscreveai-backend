package com.example.inscreveai.services;

import com.example.inscreveai.models.Person;
import com.example.inscreveai.models.dto.PersonDTO;
import com.example.inscreveai.models.dto.UserDTO;
import org.springframework.data.domain.Page;


import java.awt.print.Pageable;
import java.util.List;

public interface IPersonService {

    PersonDTO updateDTO(Long id, PersonDTO personAtualizado);

    PersonDTO saveDTO(PersonDTO dto);

    List<PersonDTO> findAllDTO();

    Page<PersonDTO> findAllPageAsDTO(Pageable pageable);

    PersonDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
