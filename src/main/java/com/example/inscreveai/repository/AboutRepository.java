package com.example.inscreveai.repository;

import com.example.inscreveai.models.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About, Long> {
}
