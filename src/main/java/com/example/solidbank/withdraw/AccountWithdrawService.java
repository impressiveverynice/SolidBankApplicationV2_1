package com.example.solidbank.withdraw;

import com.example.solidbank.Account;

public interface AccountWithdrawService {
    void withdraw(double amount, Account account);
}
