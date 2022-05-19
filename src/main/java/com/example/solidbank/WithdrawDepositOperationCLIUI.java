package com.example.solidbank;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface WithdrawDepositOperationCLIUI {
    public double requestClientAmount();
    public String requestClientAccountNumber();
}
