package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws Exception {
		int userChoice;
		int choice;
		int i = 0;
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("**********SUPER MARKET**********");
		ArrayList<Product> productList = new ArrayList<Product>();
		do {

			System.out.println("1.Management\n2.Customer");
			userChoice = scanner.nextInt();
			// if(i<=0)
			 ///{
			//System.out.println("No products available");
			// }
			// else
			// {
			switch (userChoice) {
			case 1:
				System.out.println("MENU\n 1.Add Stock\n 2.Display Stocks");
				System.out.println("Enter Choice: ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					productList.add(Service.createProduct());
					i++;
					break;
				case 2:
					if(i>0) {
					Service.displayProductDetails(productList);
					}
					else
					{
						System.out.println("No products Available");
					}
					break;
				}
				break;
			case 2:
				System.out.println("MENU\n 1.Display Products\n 2.Buy Products");
				System.out.println("Enter Choice: ");
				choice = scanner.nextInt();
				switch (choice) 
				{
				case 1:
					if(i>0)
					Service.displayProductDetails(productList);
					else
						System.out.println("No products Available");
					break;
				case 2:
					Service.purchaseProduct(productList);
					break;

				}
				break;
			}
			//}
			System.out.println("Do you want to continue? y/n");
			mainChoice = scanner.next().charAt(0);
		} while (mainChoice == 'y'||mainChoice=='Y');

	}

}