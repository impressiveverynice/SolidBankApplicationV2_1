package com.example.solidbank.account_requests;

import com.example.solidbank.Account;
import com.example.solidbank.account_creation.AccountType;
import com.example.solidbank.withdraw.AccountWithdraw;
import org.springframework.stereotype.Service;

import java.util.List;

@Service



public class AccountListingServiceImpl implements AccountListingService {

    private AccountDAO accountDAO;

    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return accountDAO.getClientAccount(clientID, accountID);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public Account getClientAccountById(String clientID, String accountId) throws Exception {
        Account account = accountDAO.getClientAccount(clientID, accountId);
        if (account == null) {
            throw new Exception("Account not found");

        } else {
            return account;
        }
    }

    @Override
    public void deleteAccountById(Long id) {
        accountDAO.deleteAccountById(id);
    }
}
