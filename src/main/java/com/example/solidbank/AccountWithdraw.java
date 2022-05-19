package com.example.solidbank;

import org.springframework.stereotype.Component;

public class AccountWithdraw extends Account{

    public AccountWithdraw(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }

}
