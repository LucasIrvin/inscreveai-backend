package com.example.inscreveai.repository;

import com.example.inscreveai.models.Panelist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanelistRepository extends JpaRepository<Panelist, Long> {
}
