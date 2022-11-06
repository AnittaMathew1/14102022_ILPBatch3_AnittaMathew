package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.service.MisService;
import com.bank.service.Service;

public class BankUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		Customer customer = null;
		char choice = 0;
		int firstChoice;
		do
		{//first view of user page
		System.out.println("*********WELCOME TO BANK************");
		System.out.println("1.New User Register 2.Existing User Login");
		firstChoice=scanner.nextInt();
		switch(firstChoice)
		{
		case 1: //creating a new account for the user
				System.out.println("CREATE A NEW ACCOUNT");
				
				String newcustomerAccountChoice = MisService.enterAccountChoice();
				accountList.add(Service.createAccount(newcustomerAccountChoice));
				customer = Service.createCustomer(accountList);
				
				System.out.println("Do you want to continue : - ");
				choice = scanner.next().charAt(0);
				break;
				
		case 2:
		do
		{  //login option of already registered users
			System.out.println("1.Create Account 2.Deposit Money 3. Display Account Details 4.Withdraw Money");
			int mainChoice = scanner.nextInt();
			switch(mainChoice)
			{
				case 1: String customerAccountChoice = MisService.enterAccountChoice();//function to create a new account
						accountList.add(Service.createAccount(customerAccountChoice));
						customer = Service.createCustomer(accountList);
						break;
				case 2: Service.depositMoney(customer);//function to deposit money to the account
						break;
				case 3: Service.displayAccountDetails(accountList,customer);//function to display account balance,account type and other details.
						break;
				case 4: Service.withdrawMoney(customer);//function to withdraw money from the account
						break;
			}
			System.out.println("Do you want to continue : - ");
			choice = scanner.next().charAt(0);
			
		}
		while(choice == 'y');
	}

	}while(choice == 'y');
}
}
