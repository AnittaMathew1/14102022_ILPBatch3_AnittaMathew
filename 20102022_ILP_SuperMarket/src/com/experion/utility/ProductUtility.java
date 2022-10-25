package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.service.ProductServices;
//import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int userChoice;
		int choice;
		int subChoice;
		int i=0;
		char mainChoice;
		char c;
		String ch;
		int item;
		Scanner scanner=new Scanner(System.in);
		System.out.println("**********SUPER MARKET**********");
		ArrayList<Product>productList=new ArrayList<Product>();
		ArrayList<Product>customerProductList=new ArrayList<Product>();
			System.out.println("1.Management\n2.Customer");
			userChoice=scanner.nextInt();
				if((i<=0)&&(userChoice==2))
					{
					System.out.println("No Stock Available");
					}
				else
				{
					switch(userChoice) 
						{
						case 1:		      //management
							System.out.println("MENU\n 1.Electronics\n 2.Fabrics");
							System.out.println("Enter Choice =");
							subChoice=scanner.nextInt();
								switch(subChoice) 
									{
									case 1:        //electronics
									System.out.println("MENU\n 1.Add Stock\n 2.Display Stock");
									System.out.println("Enter Choice =");
									choice=scanner.nextInt();
										switch(choice)
											{
											case 1:             //add stock
												productList.add(ProductServices.createProduct());
												i++;
												break;
											case 2:                   //display stock
												if(i<=0)
										
													System.out.println("No products Available");
				
												else
											
													ProductServices.displayProductDetails(productList);
										
												break;
											}
		
									case 2:                 //fabrics
										System.out.println("MENU\n 1.Add Stock\n 2.Display Stock");
										System.out.println("Enter Choice =");
										subChoice=scanner.nextInt();
										switch(subChoice)
										{
										case 1:        //add fabric
											productList.add(ProductServices.createProduct());
											i++;
											break;
										case 2:        //display fabrics
											if(i<=0)
									
												System.out.println("No products Available");
			
											else
										
												ProductServices.displayProductDetails(productList);
									
											break;
										}
									default:
										System.out.println("Enter Valid Choice");
									}
						break;
	
					case 2:	          //customer
							System.out.println("MENU\n 1.fabrics\n2.Electronics");
							System.out.println("Enter Choice =");
							choice=scanner.nextInt();
							switch(choice)
									{
									case 1:          //fabric
										System.out.println("MENU\n 1.Display Product\n 2.Buy Product\n 3.Existing Product Service");
										System.out.println("Enter Choice =");
										choice=scanner.nextInt();
										switch(choice)
										{
										case 1:       //displayproduct
											ProductServices.displayProductDetails(productList);
										
										break;
										case 2:          //buy product
											item=1;
											ProductServices.buyProduct(productList, customerProductList, item);
											item=1;
										break;
										case 3:         //existingproduct services
										
											//Customer customer = new Customer("CS001","Anitta",customerProductList);
											System.out.println("MENU\n 1.Product Exchange\n 2.Product Repair\n3.Warranty Replacement");
											System.out.println("Enter Choice =");
											subChoice=scanner.nextInt();
											switch(subChoice)
											{
											case 1:
												item=1;
												ProductServices.productExchange(productList, customerProductList, item);
												break;
											case 2:
												item=1;
												ProductServices.productRepair(productList, customerProductList, item);
												break;
											case 3:
												item=1;
												ProductServices.warrentyExchange(productList, customerProductList, item);
											}
											break;
										}
									case 2:
										
										System.out.println("MENU\n 1.Display Product\n 2.Buy Product\n 3.Existing Product Service");
										System.out.println("Enter Choice =");
										choice=scanner.nextInt();
										switch(choice)
												{
												case 1:       //displayproduct
													ProductServices.displayProductDetails(productList);
												
												break;
												case 2:  //buy product
													item=2;
													ProductServices.buyProduct(productList, customerProductList, item);
							
												break;
												case 3:         //existingproductservices
												
													//Customer customer = new Customer("CS001","Anitta",customerProductList);
													System.out.println("MENU\n 1.Product Exchange\n 2.Product Repair\n3.Warranty Replacement");
													System.out.println("Enter Choice =");
													subChoice=scanner.nextInt();
													switch(subChoice)
													{
													case 1:
														item=2;
														ProductServices.productExchange(productList, customerProductList, item);
														break;
													case 2:
														item=2;
														ProductServices.productRepair(productList, customerProductList, item);
														break;
													case 3:
														item=2;
														ProductServices.warrentyExchange(productList, customerProductList, item);
													}
													break;
												}
											default:
												System.out.println("Invalid Choice");
												break;
										}
							break;
				}
				}
}
}