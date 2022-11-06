package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;
import com.experion.service.Services;

import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList= new ArrayList<Product>();
		char mainChoice;
		do
		{
		System.out.println("1.Add Card Product 2.Add Account Product 3.Display Product");
		int choice = scanner.nextInt();
		switch(choice)
		{
			case 1:
				productList.add(Services.createProduct("Cards"));
				break;
				
			case 2:
				productList.add(Services.createProduct("Accounts"));
				break;
				
			case 3:
				//Services.buyProduct();
				Services.displayProductdetails(productList);
				break;
			default: System.out.println("Invalid Choice");
		}
		System.out.println("Do you want to continue?(yes/no)");
		mainChoice= scanner.next().charAt(0);
		}while(mainChoice=='y');
		
		}
		
		

	}


