package com.example.solidbank;

import org.springframework.stereotype.Service;

@Service
public interface CreateAccountOperationUI {
    AccountType requestAccount();
}
