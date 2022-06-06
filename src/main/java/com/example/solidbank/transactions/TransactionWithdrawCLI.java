package com.example.solidbank.transactions;

import com.example.solidbank.Account;
import com.example.solidbank.AccountBasicCLI;
import com.example.solidbank.account_requests.AccountListingService;
import com.example.solidbank.WithdrawDepositOperationCLIUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionWithdrawCLI {

    TransactionWithdraw transactionWithdraw;
    WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    AccountListingService accountListing;
    AccountBasicCLI accountBasicCLI;


    public TransactionWithdrawCLI(TransactionWithdraw transactionWithdraw, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListingService, AccountBasicCLI accountBasicCLI) {
        this.transactionWithdraw = transactionWithdraw;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListingService;
        this.accountBasicCLI = accountBasicCLI;

    }

    public void withdrawMoney(String clientID) throws Exception {
        Account account = accountListing.getClientAccount(clientID, withdrawDepositOperationCLIUI.requestClientAccountNumber());
        if(account==null){
            System.out.println("Account does not exist!");
            return;
        }
        if(account.isWithdrawAllowed()){
            System.out.println("Enter amount to withdraw");
            transactionWithdraw.execute(account, withdrawDepositOperationCLIUI.requestClientAmount());
            accountBasicCLI.getAccounts(clientID);
        } else {
            System.out.println("Withdraw is not allowed!");
            return;
        }
    }
}
