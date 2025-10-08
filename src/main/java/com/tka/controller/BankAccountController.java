package com.tka.controller;

import java.util.Scanner;

import com.tka.entity.BankAccount;
import com.tka.service.BankAccountService;
import com.tka.utility.Utility;

public class BankAccountController {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		BankAccountService service = new BankAccountService();
		boolean isContinue = true;
		
		do {
			System.out.println("1. Create New Account");
			System.out.println("2. Show Account");
			System.out.println("0. Exits");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 0:{
				isContinue = false;
				break;
			}
			case 1:{
				BankAccount bankAccount = Utility.takeAccountDetails();
				String msg = service.createAccount(bankAccount);
				System.out.println(msg);
				break;
			}
			
			case 2: {
				System.out.println(2222222);
				break;
			}
			default:
				System.out.println("Invalid Choice");
				break;
		  }
			
		}
		while(isContinue);
			System.err.println("Terminate...");
	}

}
