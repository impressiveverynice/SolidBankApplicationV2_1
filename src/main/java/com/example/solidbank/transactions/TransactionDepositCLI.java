package com.example.solidbank.transactions;

import com.example.solidbank.Account;
import com.example.solidbank.account_requests.AccountListingService;
import com.example.solidbank.WithdrawDepositOperationCLIUI;
import org.springframework.stereotype.Service;

@Service
public class TransactionDepositCLI {

    TransactionDeposit transactionDeposit;
    WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    AccountListingService accountListing;





    public TransactionDepositCLI(TransactionDeposit transactionDeposit, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListingService) {
        this.transactionDeposit = transactionDeposit;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListingService;
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
