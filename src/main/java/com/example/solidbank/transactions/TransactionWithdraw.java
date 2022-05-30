package com.example.solidbank.transactions;

import com.example.solidbank.Account;
import com.example.solidbank.withdraw.AccountWithdraw;
import com.example.solidbank.withdraw.AccountWithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionWithdraw {

    AccountWithdrawService accountWithdrawService;
    TransactionDAO transactionDAO;

    public TransactionWithdraw(AccountWithdrawService accountWithdrawService, TransactionDAO transactionDAO) {
        this.accountWithdrawService = accountWithdrawService;
        this.transactionDAO = transactionDAO;
    }

    void execute(Account accountWithdraw, double amount){
        accountWithdrawService.withdraw(amount, accountWithdraw);
    }
}
