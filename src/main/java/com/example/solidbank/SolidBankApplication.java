package com.example.solidbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class SolidBankApplication {

    private static String clientID;

    public static void main(String[] args) {
        SpringApplication.run(SolidBankApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);

        Scanner sc = new Scanner(System.in);
        boolean isWrongAnswer=true;
        System.out.println("Welcome to CLI bank service\n" +
                "Enter operation number:\n" +
                "1 - show accounts\n" +
                "2 - create account \n" +
                "3 - deposit \n" +
                "4 - withdraw \n" +
                "5 - transfer \n" +
                "6 - this message \n" +
                "7 - exit \n" +
                "$\n");
        do {

            switch (sc.next()) {
                case "1":
                    accountBasicCLI.getAccounts(clientID);
                    break;

                case "2":
                    System.out.println("CHOOSE ACCOUNT TYPE: [FIXED, CHECKING, SAVING]");
                    accountBasicCLI.createAccountRequest(clientID);
                    break;

//                case "3":
//                    transactionDepositCLI.depositMoney(clientID);
//                    break;
//
//                case "4":
//                    transactionWithdrawCLI.withdrawMoney(clientID);
//                    break;

                case "6":
                    System.out.println("Welcome to CLI bank service\n" +
                            "Enter operation number:\n" +
                            "1 - show accounts\n" +
                            "2 - create account \n" +
                            "3 - deposit \n" +
                            "4 - withdraw \n" +
                            "5 - transfer \n" +
                            "6 - this message \n" +
                            "7 - exit \n" +
                            "$\n");
                    break;

                case "7":
                    System.out.printf("Application Closed\n");
                    System.exit(0);
                    break;

                default:
                    System.out.printf("Command not recognized!\n");
                    isWrongAnswer = false;

            }
        } while (isWrongAnswer);

    }
}
