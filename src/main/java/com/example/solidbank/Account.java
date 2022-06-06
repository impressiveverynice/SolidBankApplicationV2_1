package com.example.solidbank;

import com.example.solidbank.account_creation.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Getter
@Setter

@NoArgsConstructor
@Entity
public   class Account {

    String clientID;
    double balance;
    private String accountType;

    @Column (value = "ACCOUNT_ID")
    @OneToMany(cascade = CascadeType.REMOVE)
    private int id;
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
