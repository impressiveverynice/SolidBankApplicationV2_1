package com.example.solidbank.account_creation;


import org.springframework.stereotype.Service;

@Service
public interface AccountCreationService {
    void create(AccountType accountType, long bankID, String clientID, long accountID);

}
