package com.example.inscreveai.repository;

import com.example.inscreveai.models.DiscountApplied;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountAppliedRepository extends JpaRepository<DiscountApplied, Long>{
}
