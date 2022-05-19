package com.example.solidbank;

import org.springframework.stereotype.Service;

@Service
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    AccountDAO accountDAO;

    @Override
    public void withdraw(double amount, AccountWithdraw account) {
        if (account.getBalance()>amount && account.getBalance()>0) {
            account.setBalance(account.getBalance()-amount);
        } else {

            System.out.println("There is not enough money");
        }
    }

    public AccountWithdrawServiceImpl(AccountDAO accountDAO) {}


}
