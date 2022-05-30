package com.example.solidbank;

import com.example.solidbank.account_creation.AccountType;
import org.springframework.stereotype.Service;

@Service
public interface CreateAccountOperationUI {
    AccountType requestAccount();
}
