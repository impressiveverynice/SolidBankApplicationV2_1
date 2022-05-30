package com.example.solidbank.account_creation;


public interface AccountCreationService {
    void create(AccountType accountType, long bankID, String clientID, long accountID);

}
