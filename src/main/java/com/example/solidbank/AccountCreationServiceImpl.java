package com.example.solidbank;


public class AccountCreationServiceImpl implements AccountCreationService{
    AccountDAO accountDAO;

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accountNumber = String.format("%03d%06d", 1, accountID);

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
                account = new SavingAccount(accountType, accountNumber, clientID, 0, false);
                accountDAO.createNewAccount(account);
                break;
        }
    }

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


}
