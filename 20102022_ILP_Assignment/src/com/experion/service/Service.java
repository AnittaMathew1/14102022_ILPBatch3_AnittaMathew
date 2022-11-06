package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Customer;



public class Service {

	public static Account createsavingsAccount() throws Exception {
		Account account = new Account("SM101",10000);
		return account;
	}
	
	public static Account createcurrentAccount() throws Exception {
		Account account = new Account("CA101",20000);
		return account;
	}

	public static Account createloanAccount() throws Exception {
		Account account = new Account("LA101",30000);
		return account;
	}
	
	public static void manageAccount(ArrayList<Account> accountList)  {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Code - ");
		String enteredCustomerCode = scanner.nextLine();
		if(enteredCustomerCode .equal(customer.getCustomerCode()))
		{
		for (Account account :customer.getAccountList()) {
		
			System.out.println(account.getCustomerCode()+"	"+"has the following accounts");
		}
		}
		
		

		}
	public static void displaydetailsofAccount(ArrayList<Account> accountList) {
		System.out.println("CustomerId:" + "\t" + "Customer Name "+ "Account Type "+ "Balance ");
		for (Account account : accountList) {
			if (account != null)
				System.out.println(account.getCustomerCode() + " \t\t" + account.getCustomerCode());
		}
		
	}
}
