package com.example.solidbank;


import com.example.solidbank.transactions.TransactionDepositCLI;
import com.example.solidbank.transactions.TransactionWithdrawCLI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class SolidBankApplication implements CommandLineRunner {
    private final ApplicationContext context;

    public SolidBankApplication(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(SolidBankApplication.class);
    }

    @Override
    public void run(String... arg0) {
        boolean running = true;
        String clientID = "1";

        MyCLI myCLI = context.getBean(MyCLI.class);
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
        TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);

        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.print("Welcome to CLI bank service\n");
        System.out.print("Enter operation number: \n");
        System.out.print(helpMessage);
        while(running){
            switch(myCLI.getScanner().next()){

                case "1":
                    accountBasicCLI.getAccounts(clientID);
                    break;

                case "2":
                    System.out.println("Enter account type [SAVING / FIXED / CHECKING]");
                    accountBasicCLI.createAccountRequest(clientID);
                    break;

                case "3":
                    System.out.println("Enter ID");
                    transactionDepositCLI.depositMoney(clientID);
                    accountBasicCLI.getAccounts(clientID);
                    break;

                case "4":
                    System.out.println("Enter ID");
                    transactionWithdrawCLI.withdrawMoney(clientID);
                    break;

                case "6":
                    System.out.printf(helpMessage);
                    break;

                case "7":
                    System.out.print("Application Closed\n");
                    running = false;
                    break;

                default:
                    System.out.print("Command not recognized!\n");
                    break;
            }
        }
        myCLI.getScanner().close();
    }
}