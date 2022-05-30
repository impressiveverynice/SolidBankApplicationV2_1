package com.example.solidbank.account_creation;

import com.example.solidbank.withdraw.AccountWithdraw;

public class SavingAccount extends AccountWithdraw {

    public SavingAccount(String accountType, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, clientID, balance, withdrawAllowed);
    }
}
