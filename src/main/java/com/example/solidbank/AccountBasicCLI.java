package com.example.solidbank;

import com.example.solidbank.account_requests.AccountListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountBasicCLI {

    @Autowired
    CreateAccountOperationUI createAccountOperationUI;

    @Autowired
    BankCore bankCore;

    @Autowired
    AccountListingService accountListingService;



    public void createAccountRequest(String clientID) {
        bankCore.createNewAccount(createAccountOperationUI.requestAccount(), clientID);
    }
    public void getAccounts(String clientID){
        System.out.println(accountListingService.getClientAccounts(clientID));
    }
}
