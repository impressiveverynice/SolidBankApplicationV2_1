package com.example.solidbank.transactions;

import com.example.solidbank.Account;
import com.example.solidbank.MyCLI;
import com.example.solidbank.WithdrawDepositOperationCLIUI;
import com.example.solidbank.deposit.AccountDepositService;
import org.springframework.beans.factory.annotation.Autowired;
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
