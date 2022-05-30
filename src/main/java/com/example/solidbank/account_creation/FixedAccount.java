package com.example.solidbank.account_creation;

import com.example.solidbank.deposit.AccountDeposit;


public class FixedAccount extends AccountDeposit {
    public FixedAccount(String accountType, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, clientID, balance, withdrawAllowed);
    }
}
