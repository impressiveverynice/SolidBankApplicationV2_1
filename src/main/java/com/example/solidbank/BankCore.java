package com.example.solidbank;


public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreationService;



    public BankCore(AccountCreationService accountCreationService) {
        this.accountCreationService = accountCreationService;
    }

    void createNewAccount(AccountType accountType, String clientID) {
        accountCreationService.create(accountType, id, clientID, lastAccountNumber);
        incrementLastAccountNumber();
    }
    private void incrementLastAccountNumber(){
        lastAccountNumber+=1;
    }
}
