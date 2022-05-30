package com.example.solidbank.deposit;

import com.example.solidbank.Account;

public interface AccountDepositService {
    void deposit(double amount, Account account);
}
