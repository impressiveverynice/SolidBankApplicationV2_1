package com.example.solidbank.transactions;

import lombok.Data;

@Data
public class Transaction {
    int transactionId;
    String name_of_transaction;
    Double amount;
    String account_id;
    int clientId;
    boolean transactionStatus;
    String currentdate;
}
