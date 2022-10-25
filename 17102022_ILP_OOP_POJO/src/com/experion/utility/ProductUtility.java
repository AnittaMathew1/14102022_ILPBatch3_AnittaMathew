package com.experion.utility;

import com.experion.entity.Product;
import com.experion.service.Service;
import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) {
		
		//Service service = new Service();
		int choice;
		char mainChoice;
		int index=0;
		Scanner scanner=new Scanner(System.in);
		Product productList[]= new Product[3];
		do {
			System.out.println("MENU\n 1.ADD STOCK\n 2.DISPLAY STOCK");
			System.out.println("Enter Choice =");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				productList[index]=Service.createProduct();
				index++;
				break;
			case 2:
				Service.displayProductDetails(productList);
				break;
			}
			System.out.println("Do you want to continue? yes/no");
				mainChoice=scanner.next().charAt(0);	
		}while(mainChoice=='y');

	}

}
