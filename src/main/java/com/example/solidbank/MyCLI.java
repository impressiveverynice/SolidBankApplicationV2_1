package com.example.solidbank;



import java.util.Scanner;

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

    double requestClientAmount() {
        return 0;
    }

    String requestClientAccountNumber(){
        return null;
    }

}