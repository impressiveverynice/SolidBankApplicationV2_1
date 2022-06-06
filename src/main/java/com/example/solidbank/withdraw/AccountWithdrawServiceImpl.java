package com.example.solidbank.withdraw;

import com.example.solidbank.Account;
import com.example.solidbank.account_requests.AccountDAO;
import com.example.solidbank.transactions.TransactionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountWithdrawServiceImpl implements AccountWithdrawService {

    @Autowired
    AccountDAO accountDAO;
    @Autowired
    TransactionDAO transactionDAO;

    @Override
    public void withdraw(double amount, Account account) throws Exception {
        if (account.getBalance()>amount && account.getBalance()>0) {
            account.setBalance(account.getBalance()-amount);
            accountDAO.updateAccount(account.getBalance(),account.getId());
            transactionDAO.addTransaction("withdrawal", amount, account.getId(), 1, true);
        } else {
            transactionDAO.addTransaction("withdrawal", amount, account.getId(), 1, false);
            System.out.println("There is not enough money");
            throw new Exception("Not enough money");
        }
    }

    public AccountWithdrawServiceImpl(AccountDAO accountDAO) {}


}
