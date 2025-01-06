package com.example.inscreveai.services.implementation;

import com.example.inscreveai.mappers.UserMapper;
import com.example.inscreveai.models.User;
import com.example.inscreveai.models.dto.UserDTO;

import com.example.inscreveai.repository.UserRepository;
import com.example.inscreveai.services.GenericService;
import com.example.inscreveai.services.IUserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@ComponentScan
public class UserService extends GenericService<User, Long, UserDTO> implements IUserService {

    public UserService(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }


    @Override
    public Page<UserDTO> findAllPageAsDto(Pageable pageable) {
        return null;
    }
}
