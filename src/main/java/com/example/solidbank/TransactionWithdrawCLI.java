package com.example.solidbank;

import org.springframework.stereotype.Service;

@Service
public class TransactionWithdrawCLI {
    TransactionWithdraw transactionWithdraw;
    WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    AccountListingService accountListing;

    public TransactionWithdrawCLI(TransactionWithdraw transactionWithdraw, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListing) {
        this.transactionWithdraw = transactionWithdraw;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListing;
    }

    public void withdrawMoney(String clientID){
        Account account = accountListing.getClientAccount(clientID, withdrawDepositOperationCLIUI.requestClientAccountNumber());
        AccountWithdraw newAccount = null;
        if(account==null){
            System.out.println("Account does not exist!");
            return;
        }
        if(account.isWithdrawAllowed()){
            newAccount = (AccountWithdraw) account;
        } else {
            System.out.println("Withdraw is not allowed!");
            return;
        }
        transactionWithdraw.execute(newAccount, withdrawDepositOperationCLIUI.requestClientAmount());
    }
}
