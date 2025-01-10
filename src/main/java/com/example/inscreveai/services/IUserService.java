package com.example.inscreveai.services;

import com.example.inscreveai.models.dto.UserDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IUserService {

    UserDTO updateDTO(Long id, UserDTO userAtualizado);

    UserDTO saveDTO(UserDTO dto);

    List<UserDTO> findAllDTO();

    Page<UserDTO> findAllPageAsDto(Pageable pageable);

    UserDTO findByIdDTO(Long id);

    void delete(Long id);

    Boolean existByID(Long id);

}
