package com.example.inscreveai.repository;

import com.example.inscreveai.models.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository<Answers, Long> {
}
