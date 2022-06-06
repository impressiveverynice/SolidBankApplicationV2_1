package com.example.solidbank.controller;

import com.example.solidbank.Account;
import com.example.solidbank.BankCore;
import com.example.solidbank.account_creation.AccountType;
import com.example.solidbank.account_requests.AccountDAO;
import com.example.solidbank.account_requests.AccountListingService;
import com.example.solidbank.account_requests.AccountListingServiceImpl;
import com.example.solidbank.deposit.AccountDepositService;
import com.example.solidbank.transactions.Transaction;
import com.example.solidbank.transactions.TransactionService;
import com.example.solidbank.withdraw.AccountWithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class Controller {
    @Autowired
    BankCore bankCore;
    @Autowired
    AccountWithdrawService accountWithdrawService;
    @Autowired
    AccountDepositService accountDepositService;
    @Autowired
    private AccountListingService accountListingService;
    @Autowired
    TransactionService transactionService;


    @GetMapping()
    public List<Account> getAccounts() {
        return accountListingService.getClientAccounts("1");
    }

    @PostMapping
    public String createAccount(@RequestBody AccountRequest accountRequest) {
        bankCore.createNewAccount(AccountType.valueOf(accountRequest.getAccountType()), "1");
        return(AccountType.valueOf(accountRequest.getAccountType())+" account for Client 1");
    }

    @GetMapping("/{accountId}")
    public Account getAccountById(@PathVariable String accountId) throws Exception {
        return accountListingService.getClientAccountById("1", accountId);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
//        transactionService.deleteById(String.valueOf(id));
        accountListingService.deleteAccountById(id);
        return ("Account with number "+id +"was deleted!");
    }

    @PostMapping("/{account_id}/withdraw")
    public String withdrawal(@RequestBody AccountWithdrawRequest accountWithdrawRequest, @PathVariable String account_id) throws Exception {
        accountWithdrawService.withdraw(accountWithdrawRequest.getAmount(), accountListingService.getClientAccount("1", account_id));
        return ("TRANSACTION SUCCEED");
    }

    @PostMapping("/{account_id}/deposit")
    public String deposit(@RequestBody AccountWithdrawRequest accountWithdrawRequest, @PathVariable String account_id) {
        accountDepositService.deposit(accountWithdrawRequest.getAmount(), accountListingService.getClientAccount("1", account_id));
        return ("TRANSACTION SUCCEED");
    }

    @GetMapping("/{accountId}/transactions")
    public List<Transaction> getTransactionsById(@PathVariable String accountId) {
        return transactionService.transactionsList(accountId);
    }
}