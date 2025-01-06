package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.User;
import com.example.inscreveai.models.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class UserMapper implements EntityMapper<UserDTO, User> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        UserMapper.mapper = mapper;
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        return mapper.map(userDTO, User.class);
    }

    @Override
    public UserDTO toDto(User user) {
        return mapper.map(user, UserDTO.class);
    }

    @Override
    public List<User> toEntity(List<UserDTO> userDTOList) {
        return userDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> toDto(List<User> userList) {
        return userList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
