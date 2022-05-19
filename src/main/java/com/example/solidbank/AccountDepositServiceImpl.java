package com.example.solidbank;

import org.springframework.stereotype.Service;

@Service
public class AccountDepositServiceImpl implements AccountDepositService{
    AccountDAO accountDAO;

    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public void deposit(double amount, Account account) {
        account.setBalance(account.getBalance()+amount);
    }
}
