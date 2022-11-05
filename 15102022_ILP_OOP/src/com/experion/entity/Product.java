package com.experion.entity;

import java.util.Scanner;

public class Product {
	
	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	boolean active;
	
	
	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product code");
		productCode = scanner.nextLine();
		
		System.out.println("Enter product Name");
		productName = scanner.nextLine();
		
		System.out.println("Enter product Description");
		productDescription = scanner.nextLine();
		
		System.out.println("Enter product prize");
		productPrice = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Enter product open date");
		openDate = scanner.nextLine();
		
		System.out.println("Enter product validity date");
		validityDate = scanner.nextLine();
		
		System.out.println("Enter product activity status");
		active = scanner.nextBoolean();
	}
	
	public void displayProductDetails() {
		System.out.println("Product Name " + " " + "Product Description" + " " + "Product Price"
				+ " " + "Open Date" + " " + "Expiry Date");
				System.out.println(productName + " " + productDescription + " " + productPrice
				+ " " + openDate + " " + validityDate);

				}

	}


