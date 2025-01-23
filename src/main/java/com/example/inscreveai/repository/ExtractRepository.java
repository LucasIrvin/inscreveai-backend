package com.example.inscreveai.repository;

import com.example.inscreveai.models.Extract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtractRepository extends JpaRepository<Extract, Long>{
}
