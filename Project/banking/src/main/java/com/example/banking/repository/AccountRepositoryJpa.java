package com.example.banking.repository;

import com.example.banking.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepositoryJpa extends JpaRepository<Accounts,Integer> {
    long countByType(String type);
    List<Accounts> findByUserId(Integer id);
    Optional<Accounts> findFirstByUserId(Integer userId);
    Optional<Accounts> findByAccountNumber(String senderAccountNumber);
}
