package com.example.solidbank.deposit;

import com.example.solidbank.Account;
import com.example.solidbank.account_creation.AccountType;


public class AccountDeposit extends Account {


    public AccountDeposit(String accountType, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, clientID, balance, withdrawAllowed);
    }
}
