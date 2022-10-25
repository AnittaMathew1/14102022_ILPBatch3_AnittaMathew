package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		//Service service = new Service();
		int userChoice;
		int choice;
		char mainChoice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("**********SUPER MARKET**********");
		ArrayList<Product>productList=new ArrayList<Product>();
		do {
			System.out.println("1.Management\n2.Customer");
			userChoice=scanner.nextInt();
			switch(userChoice) {
				case 1:	System.out.println("MENU\n 1.Add Stock\n 2.Display Stocks");
						System.out.println("Enter Choice =");
						choice=scanner.nextInt();
					switch(choice) {
						case 1:
							productList.add(Service.createProduct());
							break;
						case 2:
							Service.displayProductDetails(productList);
							break;
						}
				case 2:	System.out.println("MENU\n 1.Display Products\n 2.Buy Products");
						System.out.println("Enter Choice =");
						choice=scanner.nextInt();
					switch(choice) {
						case 1:
							Service.displayProductDetails(productList);
							break;
						case 2:
							Service.displayProductDetails(productList);
							break;
					}
			}
			System.out.println("Do you want to continue? yes/no");
				mainChoice=scanner.next().charAt(0);	
		}while(mainChoice=='y');
	}
}
