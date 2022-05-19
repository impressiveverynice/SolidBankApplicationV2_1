package com.example.solidbank;



import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class MyCLI implements CLIUI{
    private Scanner scanner;

    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    MyCLI(Scanner scanner) {

        this.scanner = scanner;
    }

    @Override
    public AccountType requestAccount() {
        switch (scanner.next()){
            case "SAVING":
                return AccountType.SAVING;

            case "CHECKING":
                return AccountType.CHECKING;

            case "FIXED":
                return AccountType.FIXED;
            default:
                System.out.printf("Account type is not recognized!\n");
        }
           return null;
    }

    public double requestClientAmount() {
        return Double.parseDouble(scanner.next()) ;
    }

    public String requestClientAccountNumber(){
        return scanner.next();
    }

    public Scanner getScanner() {
        return scanner;
    }
}