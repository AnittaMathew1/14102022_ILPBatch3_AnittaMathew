package com.experion.supermarket;

import java.security.Provider.Service;
import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		int choice;
		String flag;
		System.out.println("********SUPER MARKET MANAGEMENT**************");
		do {
			System.out.println("MENU\n 1.ADD STOCK\n 2.DISPLAY STOCK\n 3.EXIT");
			System.out.println("Enter Choice =");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				service.inputProductDetails();
				break;
			case 2:
				service.displayProductDetails();
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue? yes/no");
				flag=scanner.nextLine();	
		}while((flag=="YES")||(flag=="yes"));
				
				
		
		

	}

}
