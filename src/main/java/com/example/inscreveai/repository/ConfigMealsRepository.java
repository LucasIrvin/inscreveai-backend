package com.example.inscreveai.repository;

import com.example.inscreveai.models.ConfigMeals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigMealsRepository extends JpaRepository<ConfigMeals, Long> {
}
