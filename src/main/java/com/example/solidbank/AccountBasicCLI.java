package com.example.solidbank;


public class AccountBasicCLI {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListingService;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListingService = accountListingService;
    }

    void createAccountRequest(String clientID) {
        bankCore.createNewAccount(createAccountOperationUI.requestAccount(), clientID);
    }
    void getAccounts(String clientID){
        System.out.println(accountListingService.getClientAccounts(clientID));
    }
}
