package com.example.solidbank;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class TransactionDepositCLI {

    TransactionDeposit transactionDeposit;
    WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    AccountListingService accountListing;



    public TransactionDepositCLI(TransactionDeposit transactionDeposit, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListing) {
        this.transactionDeposit = transactionDeposit;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListing;
    }


    public void depositMoney(String clientID) {

        Account account = accountListing.getClientAccount(clientID, withdrawDepositOperationCLIUI.requestClientAccountNumber());

        if(account==null){
            System.out.println("Account does not exist!");
            return;
        }
        System.out.println("Enter amount to deposit");
        transactionDeposit.execute(account, withdrawDepositOperationCLIUI.requestClientAmount());

    }
}
