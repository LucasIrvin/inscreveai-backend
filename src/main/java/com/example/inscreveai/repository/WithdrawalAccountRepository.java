package com.example.inscreveai.repository;

import com.example.inscreveai.models.WithdrawalAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithdrawalAccountRepository extends JpaRepository<WithdrawalAccount, Long> {
}
