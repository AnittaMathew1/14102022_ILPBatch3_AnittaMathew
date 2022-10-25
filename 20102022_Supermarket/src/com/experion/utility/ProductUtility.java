package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		char userChoice;
		int mainChoice1, mainChoice2, mainChoice3, mainChoice4, mainChoice5, mainChoice6, mainChoice7;
		int i = 0;
		int item;
		Scanner scanner = new Scanner(System.in);
		System.out.println("**********SUPER MARKET**********");
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer Customer = null;
		Product product = null;
		do {
			System.out.println("1.Management\n2.Customer\n3.Exit");
			mainChoice1 = scanner.nextInt();
			if ((i <= 0) && (mainChoice1 == 2))
			{
				System.out.println("No Stock Available");
			}
			else
			{
				switch (mainChoice1) {
				case 1:
					// management
						System.out.println("MENU\n 1.Electronics\n 2.Fabrics");
						System.out.println("Enter Choice =");
						mainChoice2 = scanner.nextInt();

						switch (mainChoice2) 
						{
						case 1:
							// electronics
								System.out.println("MENU\n 1.Add Stock\n 2.Display Stock");
								System.out.println("Enter Choice =");
								mainChoice3 = scanner.nextInt();
								
								switch (mainChoice3)
								{
								case 1: // add stock
									productList.add(Service.createProduct("Electronics"));
									i++;
									break;
								case 2: // display stock
									if (i <= 0) {

										System.out.println("No products Available");
										break;
									}

									else {

										Service.displayProductDetails(productList);
										break;
									}

								default:
									System.out.println("Invalid Choice");
									break;
								}
								break;

						case 2:
							// fabrics
								System.out.println("MENU\n 1.Add Stock\n 2.Display Stock");
								System.out.println("Enter Choice =");
								mainChoice4 = scanner.nextInt();

								switch (mainChoice4)
								{
								case 1: // add fabric
									productList.add(Service.createProduct("Fabrics"));
									// i++;
									break;
								case 2: // display fabrics
									if (i <= 0) {

										System.out.println("No products Available");
										break;
									}

									else {

										Service.displayProductDetails(productList);
										break;
									}

								default:
									System.out.println("Invalid Choice");
									break;
								}
								
							break;

						default:
							System.out.println("Enter Valid Choice");
							break;
						}

						break;

				case 2: // customer
					
					
					System.out.println("MENU\n 1.fabrics\n2.Electronics");
					System.out.println("Enter Choice =");
					mainChoice5 = scanner.nextInt();
					
						switch (mainChoice5) {
						case 1: // fabric
							System.out.println("MENU\n 1.Display Product\n 2.Buy Product\n 3.Existing Product Service");
							System.out.println("Enter Choice =");
							mainChoice6 = scanner.nextInt();

							Product selectedProduct;
							
								switch (mainChoice6) {
								case 1: // displayproduct
									Service.displayProductDetails(productList);
									break;

								case 2: // buy product
									selectedProduct = Service.buyProduct(productList);
									scanner.nextLine();
									System.out.println("Enter Customer Code : ");
									String customerCode = scanner.nextLine();
									System.out.println("Enter Customer Name : ");
									String customerName = scanner.nextLine();
									customerList
											.add(Customer = new Customer(customerCode, customerName, selectedProduct));
									break;

								case 3: // existingproduct services //////////////////

									Date currentDate = new Date();
									Service.getProductService(currentDate, customerList);
									break;

								}

								

						case 2:               //for electronics

							System.out.println("MENU\n 1.Display Product\n 2.Buy Product\n 3.Existing Product Service");
							System.out.println("Enter Choice =");
							mainChoice7 = scanner.nextInt();
							
								switch (mainChoice7) {
								case 1: // displayproduct
									Service.displayProductDetails(productList);
									break;

								case 2: // buy product
									selectedProduct = Service.buyProduct(productList);
									scanner.nextLine();
									System.out.println("Enter Customer Code : ");
									String customerCode = scanner.nextLine();
									System.out.println("Enter Customer Name : ");
									String customerName = scanner.nextLine();
									customerList
											.add(Customer = new Customer(customerCode, customerName, selectedProduct));
									break;

								case 3: // existingproductservices
									Date currentDate = new Date();
									Service.getProductService(currentDate, customerList);
									break;

								default:
									System.out.println("Invalid Choice");
									break;
								}
								
						break;
						default:
							System.out.println("Invalid Choice");
						}
						

				}
			}
			System.out.print("Press YESs to continue with Main Menu");
			userChoice= scanner.next().charAt(0);
		} while (userChoice=='y');
	}
}
