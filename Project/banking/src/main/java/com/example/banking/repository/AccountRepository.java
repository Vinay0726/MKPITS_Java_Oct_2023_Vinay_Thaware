package com.example.banking.repository;

import com.example.banking.model.Accounts;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<Accounts,Integer> {
    Optional<Accounts> findByUserId(Integer userId);
}
