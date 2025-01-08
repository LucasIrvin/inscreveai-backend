package com.example.inscreveai.repository;

import com.example.inscreveai.models.EventPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPageRepository extends JpaRepository<EventPage, Long> {
}
