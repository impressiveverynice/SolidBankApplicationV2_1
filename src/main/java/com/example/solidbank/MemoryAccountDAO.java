package com.example.solidbank;



import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryAccountDAO implements AccountDAO{

    List<Account> accountList = new ArrayList<>();
    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        for (Account account: accountList){
            if (account.getId().equals(accountID)){
                System.out.println(accountID);
                return account;
            }
        }
        return null;
    }
}
