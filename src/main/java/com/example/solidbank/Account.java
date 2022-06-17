package com.example.solidbank;

import com.example.solidbank.account_creation.AccountType;
import lombok.*;



import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
public class Account {

    @Id
    @Column (name = "ACCOUNT_ID")
    private Integer id;
    @Column (name = "CLIENT_ID")
    String clientID;
    @Column (name = "BALANCE")
    double balance;
    @Column (name = "ACCOUNT_TYPE")
    private String accountType;
    @Column (name = "WITHDRAW_ALLOWED")
    boolean withdrawAllowed;










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
