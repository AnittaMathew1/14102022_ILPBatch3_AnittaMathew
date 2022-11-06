package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Customer;
import com.experion.service.Service;

public class Bankutility {

	public static void main(String[] args) throws Exception {
		int userChoice;
		int choice;
		int i = 0;
		char mainChoice;
		String customerId;
		char c;
		Scanner scanner = new Scanner(System.in);
		
		Customer customer = new Customer();
		ArrayList<Account>accountList=new ArrayList<Account>();
		do
		{
		System.out.println("**********Welcome To Bank**********");
		System.out.println("1.Create Account\n2.Manage Account\n3.Display Account\n4.Exit");
		userChoice = scanner.nextInt();
		if(userChoice==2)
		{
			System.out.println("Enter the customer Id:");
			customerId = scanner.nextLine();
			//if(i<=0)
			//System.out.println("Customer Id not available.Create a new Account");
			
		}
		else
		{
			
			System.out.println("1.Create Account\n2.Manage Account\n3.Exit");
			switch(userChoice) {
			case 1:
				if(customer==null)
				{
				System.out.println("Enter Customer Code - ");
				String customerCode = scanner.nextLine();
				
				System.out.println("Enter Customer Name - ");
				String customerName = scanner.nextLine();
				}
				System.out.println("****Accounts Available***********");
				System.out.println("MENU\n 1.Savings Max Account\n 2.Current Account\n 3.Loan Account");
				System.out.println("Enter Choice =");
				choice=scanner.nextInt();
				switch(choice)
				{
				case 1: {
					accountList.add(Service.createsavingsAccount());
					i++;
					break;
				}
				case 2: {
					accountList.add(Service.createcurrentAccount());
					i++;
					break;
				}
				case 3: {
				
					accountList.add(Service.createloanAccount());
					i++;
					break;
				}
				
				}
				customer.setAccountList(accountList);
				break;
			
			
			case 2:
				Service.manageAccount(customer);
				i++;
				break;
				
			
			case 3:{
				Service.displaydetailsofAccount(accountList);
				i++;
				break;
				
			}
			
			
					
				
}
			System.out.println("Do you want to continue? yes/no");
			
			}
		
		c=scanner.next().charAt(0);	
		}while(c=='y');
	}
}
