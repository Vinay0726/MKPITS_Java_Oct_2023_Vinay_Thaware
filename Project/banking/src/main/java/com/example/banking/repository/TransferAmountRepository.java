package com.example.banking.repository;

import com.example.banking.model.Accounts;
import com.example.banking.model.TransferAmount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransferAmountRepository extends CrudRepository<TransferAmount,Integer> {

}
