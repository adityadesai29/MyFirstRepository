package com.tka.utility;

import java.util.Scanner;
import com.tka.entity.BankAccount;

public class Utility {

    private static Scanner scanner = new Scanner(System.in);

    public static BankAccount takeAccountDetails() {
        System.out.println("Enter Account Number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Account Holder Name:");
        String accountHolderName = scanner.nextLine();

        System.out.println("Enter Account Type:");
        String accountType = scanner.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("Enter Creation Date (YYYY-MM-DD):");
        String createAt = scanner.nextLine();

        System.out.println("Enter Branch Name:");
        String branch = scanner.nextLine();

        System.out.println("Enter IFSC Code:");
        String ifscCode = scanner.nextLine();

        return new BankAccount(accountNumber, accountHolderName, balance, accountType, createAt, branch, ifscCode);
    }
}
