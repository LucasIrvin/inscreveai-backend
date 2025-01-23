package com.example.inscreveai.repository;

import com.example.inscreveai.models.CouponApplied;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponAppliedRepository extends JpaRepository<CouponApplied, Long> {
}
