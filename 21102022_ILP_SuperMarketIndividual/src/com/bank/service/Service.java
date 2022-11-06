package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;

public class Service {
	
	public static Account createAccount(String accountType) {
		
		Account account = null;
		if(accountType.compareTo("SMA")==0)
		{
			account = new Account("Savings Max Account",1000);
		}
		else if(accountType.compareTo("CA")==0)
		{
			account = new Account("Current Account",1000);
		}
		else if(accountType.compareTo("LA")==0)
		{
			account = new Account("Loan Account",0);
		}
		
		return account;
		
		
	}
	public static Customer createCustomer(ArrayList<Account> accountList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		String customerId = scanner.nextLine();
		System.out.println("Enter Customer Name: ");
		String customerName = scanner.nextLine();
		Customer customer = new Customer(customerId,accountList,customerName);
		return customer;
	}
	public static void depositMoney(Customer customer) {
		
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
		System.out.println("Account Name " + "     "+"Account Balance");
		for(Account account : customerAccountList)
			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		System.out.println("Select the account you want to deposit money - ");
		String account = scanner.nextLine();
		System.out.println("Enter the amount to be deposited - ");
		double depositMoney = scanner.nextDouble();
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(account)==0)
			{
				
				selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() + depositMoney);
			}
		
		
	}
	
	public static void withdrawMoney(Customer customer) {
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
		System.out.println("Account Name " + "     "+"Account Balance");
		for(Account account : customerAccountList)
			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		System.out.println("Select the account from which you want to withdraw money - ");
		String account = scanner.nextLine();
		System.out.println("Enter the amount to withdraw- ");
		double withdrawMoney = scanner.nextDouble();
		
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(account)==0)
				
			{
				if(selectedAccount.getAccountBalance()<= withdrawMoney)
						{
					        System.out.println("Not Sufficient Account Balance");
						}
				else {
				
				selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() - withdrawMoney);
			}
			}
		}
		
		
		
	
	public static void displayAccountDetails(ArrayList<Account> accountList, Customer customer) {
		
		System.out.println("Customer Name"+"	"+"Customer Code"+"		"+"Account Name " + "	"+"Account Balance");
		for(Account account : accountList)
			System.out.println(customer.getCustomerName()+"		"+customer.getCustomerCode()+"		"+account.getProductName() + "     "+ account.getAccountBalance());
			
		
	}
	


}
