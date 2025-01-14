package com.example.inscreveai.repository;

import com.example.inscreveai.models.MealPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealPackageRepository extends JpaRepository<MealPackage, Long> {
}
