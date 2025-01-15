package com.example.inscreveai.mappers;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.models.Answers;
import com.example.inscreveai.models.dto.AnswersDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@ComponentScan
public class AnswersMapper implements EntityMapper<AnswersDTO, Answers> {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        AnswersMapper.mapper = mapper;
    }

    @Override
    public Answers toEntity(AnswersDTO answersDTO) {
        return mapper.map(answersDTO, Answers.class);
    }

    @Override
    public AnswersDTO toDto(Answers answers) {
        return mapper.map(answers, AnswersDTO.class);
    }

    @Override
    public List<Answers> toEntity(List<AnswersDTO> answersDTOList) {
        return answersDTOList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<AnswersDTO> toDto(List<Answers> answersList) {
        return answersList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }



}
