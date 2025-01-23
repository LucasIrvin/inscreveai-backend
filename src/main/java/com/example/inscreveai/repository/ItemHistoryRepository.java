package com.example.inscreveai.repository;

import com.example.inscreveai.models.ItemHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemHistoryRepository extends JpaRepository<ItemHistory, Long>{
}
