package com.example.solidbank.account_requests;



import com.example.solidbank.Account;
import com.example.solidbank.account_creation.AccountType;
import com.example.solidbank.withdraw.AccountWithdraw;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountListingService {
    Account getClientAccount(String clientID, String accountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    List<Account>getClientAccounts(String clientID);
    List<Account> getClientAccountByType(String clientID, AccountType accountType);
}
