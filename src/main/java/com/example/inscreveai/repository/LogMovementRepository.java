package com.example.inscreveai.repository;

import com.example.inscreveai.models.LogMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogMovementRepository extends JpaRepository<LogMovement, Long>{
}
