package com.example.solidbank;

import com.example.solidbank.account_creation.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;


@Getter
@Setter

@NoArgsConstructor
public   class Account {

    String clientID;
    double balance;
    private String accountType;
    @Column (value = "ACCOUNT_ID")
    private int id;
    boolean withdrawAllowed;








//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getClientID() {
//        return clientID;
//    }
//
//    public void setClientID(String clientID) {
//        this.clientID = clientID;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public boolean isWithdrawAllowed() {
        return withdrawAllowed;
    }

//    public void setWithdrawAllowed(boolean withdrawAllowed) {
//        this.withdrawAllowed = withdrawAllowed;
//    }



    public Account(String accountType, String clientID, double balance, boolean withdrawAllowed) {

        this.accountType = accountType;
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;

    }

    @Override
    public String toString() {

        return "Account{" +
                "accountType=" + accountType +
                ", id='" + String.format("%03d%06d", 1, id) + '\'' +
                ", clientID='" + clientID + '\'' +
                ", balance=" + balance +
                ", withdrawAllowed=" + withdrawAllowed +
                '}' + "\n";
    }
}
