package com.example.solidbank.withdraw;

import com.example.solidbank.Account;
import com.example.solidbank.account_creation.AccountType;
import lombok.NoArgsConstructor;


public class AccountWithdraw extends Account {

    public AccountWithdraw(String accountType, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, clientID, balance, withdrawAllowed);
    }
}
