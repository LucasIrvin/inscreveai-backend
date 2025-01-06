package com.example.inscreveai.services;

import com.example.inscreveai.config.mapper.EntityMapper;
import com.example.inscreveai.exceptions.InscreveAiNotFoundException;
import com.example.inscreveai.mappers.UserMapper;
import com.example.inscreveai.models.Person;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class GenericService<T, ID, DTO> {

    protected final JpaRepository<T, ID> repository;
    protected final EntityMapper<DTO, T> mapper;

    public GenericService(JpaRepository<T, ID> repository, EntityMapper<DTO, T> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    public T save(T entidade) {
        return repository.save(entidade);
    }

    @Transactional
    public List<T> saveAll(List<T> entidades) {
        return repository.saveAll(entidades);
    }

    @Transactional
    public DTO saveDTO(DTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Transactional
    public List<DTO> saveAllDTO(List<DTO> listDTO) {
        return mapper.toDto(repository.saveAll(mapper.toEntity(listDTO)));
    }

    @Transactional
    public T update(T entidade) {
        return repository.saveAndFlush(entidade);
    }

    @Transactional
    public DTO updateDTO(ID id, DTO dto) {

        if (repository.existsById(id)) {
            return mapper.toDto(repository.saveAndFlush(mapper.toEntity(dto)));
        } else {
            throw new InscreveAiNotFoundException("Not Found.");
        }
    }

    @Transactional
    public void delete(ID id) {
        repository.deleteById(id);
    }

    @Transactional
    public void deleteAll(List<T> entidades) {
        repository.deleteAll(entidades);
    }

    public List<DTO> findAllDTO() {
        return mapper.toDto(repository.findAll());
    }

    public Page<T> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<DTO> findAllPageAsDTO(Pageable pageable) {
        try {
            Page<T> page = repository.findAll(pageable);
            List<DTO> dtos = page.getContent().stream()
                    .map(mapper::toDto)
                    .collect(Collectors.toList());
            return new PageImpl<>(dtos, pageable, page.getTotalElements());
        } catch (Exception e) {
            throw new InscreveAiNotFoundException("Erro ao buscar dados");
        }
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public DTO findByIdDTO(ID id) {
        return mapper.toDto(
                repository.findById(id).orElseThrow(() -> new InscreveAiNotFoundException("Não encontrado."))
        );
    }

    public T findById(ID id) {
        return repository.findById(id).orElseThrow(() -> new InscreveAiNotFoundException("Não encontrado."));
    }

    public Boolean existByID(ID id) {
        return repository.existsById(id);
    }


}
