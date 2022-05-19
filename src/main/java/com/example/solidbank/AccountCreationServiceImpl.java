package com.example.solidbank;

import org.springframework.stereotype.Service;

@Service

public class AccountCreationServiceImpl implements AccountCreationService{
    AccountDAO accountDAO;

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long lastAccountNumber) {
        String accountNumber = String.format("%03d%06d", 1, lastAccountNumber); //lastaccounnumber 001000001

        if(accountType==null) return;

        switch (accountType){
            case FIXED:
                Account account = new FixedAccount(accountType, accountNumber, clientID, 0, false);
                accountDAO.createNewAccount(account);

                break;
            case CHECKING:
                account = new CheckingAccount(accountType, accountNumber, clientID, 0, true);
                accountDAO.createNewAccount(account);
                break;
            case SAVING:
                account = new SavingAccount(accountType, accountNumber, clientID, 0, true);
                accountDAO.createNewAccount(account);
                break;
        }
    }

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


}
