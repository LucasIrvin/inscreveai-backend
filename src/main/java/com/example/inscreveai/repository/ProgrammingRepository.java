package com.example.inscreveai.repository;

import com.example.inscreveai.models.Programming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingRepository extends JpaRepository<Programming, Long> {
}
