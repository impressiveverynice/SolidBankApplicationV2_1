package com.example.solidbank.account_creation;

import com.example.solidbank.Account;
import com.example.solidbank.account_requests.AccountDAO;
import org.springframework.stereotype.Service;

@Service

public class AccountCreationServiceImpl implements AccountCreationService{
    AccountDAO accountDAO;
    Account account;

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long lastAccountNumber) {
//        String accountNumber = String.format("%03d%06d", 1, lastAccountNumber); //lastaccounnumber 001000001

        if(accountType==null) return;

        switch (accountType){
            case FIXED:
                account = new FixedAccount(accountType.toString(), clientID, 0, false);
                break;

            case CHECKING:
                account = new CheckingAccount(accountType.toString(), clientID, 0, true);

                break;
            case SAVING:
                account = new SavingAccount(accountType.toString(), clientID, 0, true);

                break;
        }
        accountDAO.createNewAccount(account.getAccountType().toString(), account.getBalance(), account.getClientID(), account.isWithdrawAllowed());
    }

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


}
