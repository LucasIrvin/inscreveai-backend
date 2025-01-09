package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.AboutDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IAboutService {

    AboutDTO updateDTO(Long id, AboutDTO aboutAtualizado);

    AboutDTO saveDTO(AboutDTO dto);

    List<AboutDTO> findAllDTO();

    Page<AboutDTO> findAllPageAsDTO(Pageable pageable);

    AboutDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);


}
