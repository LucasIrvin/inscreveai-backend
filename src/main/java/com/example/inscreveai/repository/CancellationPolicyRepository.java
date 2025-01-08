package com.example.inscreveai.repository;

import com.example.inscreveai.models.CancellationPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancellationPolicyRepository extends JpaRepository<CancellationPolicy, Long> {
}
