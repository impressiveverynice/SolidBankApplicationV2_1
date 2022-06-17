package com.example.solidbank;

import com.example.solidbank.account_creation.AccountCreationService;
import com.example.solidbank.account_creation.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;

    @Autowired
    AccountCreationService accountCreationService;


    public void createNewAccount(AccountType accountType, String clientID) {
        accountCreationService.create(accountType, id, clientID, lastAccountNumber);
        incrementLastAccountNumber();
    }
    private void incrementLastAccountNumber(){
        lastAccountNumber+=1;
    }
}
