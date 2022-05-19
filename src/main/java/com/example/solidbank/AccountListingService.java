package com.example.solidbank;



import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountListingService {
    Account getClientAccount(String clientID, String accountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    List<Account>getClientAccounts(String clientID);
    List<Account> getClientAccountByType(String clientID, AccountType accountType);
}
