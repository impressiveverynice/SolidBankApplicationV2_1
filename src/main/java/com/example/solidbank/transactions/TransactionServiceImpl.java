package com.example.solidbank.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService{

    public TransactionServiceImpl(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    TransactionDAO transactionDAO;
    @Override
    public List<Transaction> transactionsList(String id) {
        return transactionDAO.getTransactionsById(id);

    }

}
