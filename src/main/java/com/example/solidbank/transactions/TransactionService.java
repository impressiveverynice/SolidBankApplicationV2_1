package com.example.solidbank.transactions;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TransactionService {
     List<Transaction> transactionsList(String id);


}
