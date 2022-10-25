package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int choice;
		char mainChoice;
		ArrayList<Product>productList=new ArrayList<Product>();
		System.out.println("**********WELCOME TO HDFC BANK*********");
		
		
		do {
			System.out.println("MENU\n1.Add Card\n2.Add Account\n3.Buy Product");
			choice=scanner.nextInt();
		
		switch(choice) 
		{
			case 1:
				productList.add(Service.addCard("Card"));
				break;
			case 2:
				productList.add(Service.addCard("Accounts"));
				break;
			case 3:
				Service.displayProductDetails(productList);
				break;
			default:
				System.out.println("Invalid Choice");		

		}
		System.out.println("Do you want to continue: y/n");
		mainChoice=scanner.next().charAt(0);
		
		
	}while(mainChoice=='y');
	}
}

