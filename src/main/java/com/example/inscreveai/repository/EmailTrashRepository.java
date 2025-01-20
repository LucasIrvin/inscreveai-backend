package com.example.inscreveai.repository;

import com.example.inscreveai.models.EmailTrash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTrashRepository extends JpaRepository<EmailTrash, Long> {
}
