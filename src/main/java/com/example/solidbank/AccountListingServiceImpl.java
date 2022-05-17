package com.example.solidbank;



import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {

    private AccountDAO accountDAO;

    public AccountListingServiceImpl (AccountDAO accountDAO) {
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
        return accountDAO.getClientAccount(clientID);

    }

    @Override
    public List<Account> getClientAccountByType(String clientID, AccountType accountType) {
        return null;
    }
}
