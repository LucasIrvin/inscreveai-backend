package com.example.inscreveai.repository;

import com.example.inscreveai.models.AdditionalItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalItemRepository extends JpaRepository<AdditionalItem, Long>{
}
