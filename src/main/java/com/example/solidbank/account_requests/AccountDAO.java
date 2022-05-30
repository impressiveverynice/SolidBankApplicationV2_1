package com.example.solidbank.account_requests;



import com.example.solidbank.Account;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDAO extends CrudRepository<Account, Long> {

    @Query("SELECT * FROM ACCOUNT WHERE CLIENT_ID=:clientID")
    List<Account> getClientAccounts(String clientID);
    @Modifying
    @Query ("INSERT INTO ACCOUNT(ACCOUNT_TYPE, BALANCE, CLIENT_ID, WITHDRAW_ALLOWED) VALUES (:accountType, :balance, :clientID, :withdrawAllowed)")
    void createNewAccount(String accountType, double balance, String clientID, boolean withdrawAllowed);

    @Query ("SELECT * FROM ACCOUNT WHERE ACCOUNT_ID=:id")
    Account getClientAccount(String clientID, String id);
    @Modifying
    @Query ("UPDATE ACCOUNT SET BALANCE=:amount  WHERE ACCOUNT_ID=:id")
    void updateAccount(double amount, int id);
}