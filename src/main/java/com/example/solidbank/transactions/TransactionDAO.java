package com.example.solidbank.transactions;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jdbc.repository.query.Query;

import javax.validation.constraints.DecimalMin;
import java.util.List;
@Repository
public interface TransactionDAO extends CrudRepository<Transaction, Long> {
    @Query ("SELECT * FROM TRANSACTIONS WHERE ACCOUNT_ID=:id")
    List<Transaction> getTransactionsById(String id);
    @Modifying
    @Query ("INSERT INTO TRANSACTIONS (NAME_OF_TRANSACTION, AMOUNT, ACCOUNT_ID, CLIENT_ID, TRANSACTION_STATUS) VALUES (:transaction, :amount, :id, :clientId, :status)")
    void addTransaction(String transaction, double amount, int id, int clientId, boolean status);


}
