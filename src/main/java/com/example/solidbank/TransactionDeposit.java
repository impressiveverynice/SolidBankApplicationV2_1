package com.example.solidbank;

import org.springframework.stereotype.Component;

@Component
public class TransactionDeposit {
    AccountDepositService accountDepositService;
    TransactionDAO transactionDAO;


    public TransactionDeposit(AccountDepositService accountDepositService, TransactionDAO transactionDAO) {
        this.accountDepositService = accountDepositService;
        this.transactionDAO = transactionDAO;
    }

    void execute(Account account, double amount) {
        accountDepositService.deposit(amount, account);
    }
}
