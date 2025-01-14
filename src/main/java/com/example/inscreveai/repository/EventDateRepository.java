package com.example.inscreveai.repository;

import com.example.inscreveai.models.EventDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDateRepository extends JpaRepository<EventDate, Long> {
}
