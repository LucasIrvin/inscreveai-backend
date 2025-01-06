package com.example.inscreveai.config.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    private static ModelMapper modelMapper(){
        var modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setSkipNullEnabled(true);

        return modelMapper;
    }
}
