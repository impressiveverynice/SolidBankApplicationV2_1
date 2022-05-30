package com.example.solidbank.deposit;

import com.example.solidbank.Account;
import com.example.solidbank.account_requests.AccountDAO;
import com.example.solidbank.transactions.TransactionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDepositServiceImpl implements AccountDepositService{
    AccountDAO accountDAO;
    @Autowired
    TransactionDAO transactionDAO;

    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public void deposit(double amount, Account account) {
        account.setBalance(account.getBalance()+amount);
        accountDAO.updateAccount(account.getBalance(),account.getId());
        transactionDAO.addTransaction("deposit", amount, account.getId(), 1, true);
    }
}
