package com.example.solidbank;

import org.springframework.stereotype.Component;

@Component
public class TransactionWithdraw {
    AccountWithdrawService accountWithdrawService;
    TransactionDAO transactionDAO;

    public TransactionWithdraw(AccountWithdrawService accountWithdrawService, TransactionDAO transactionDAO) {
        this.accountWithdrawService = accountWithdrawService;
        this.transactionDAO = transactionDAO;
    }

    void execute(AccountWithdraw accountWithdraw, double amount){
        accountWithdrawService.withdraw(amount, accountWithdraw);
    }
}
