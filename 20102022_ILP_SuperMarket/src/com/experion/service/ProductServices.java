package com.experion.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Customer;
//import com.experion.entity.Electronics;
import com.experion.entity.Product;

public class ProductServices {

	   public static Product createProduct() throws Exception {



	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Proudct Code - ");
	        String productCode = scanner.nextLine();
	        System.out.println("Enter Product Name - ");
	        String productName = scanner.nextLine();
	        System.out.println("Enter Product Description - ");
	        String productDescription = scanner.nextLine();
	        System.out.println("Enter Product Price - ");
	        double productPrice = scanner.nextDouble();
	        System.out.println("Enter Product Service Charge - ");
	        double productServiceCharge = scanner.nextDouble();

	       Product product = new Product(productCode, productName, productDescription, productPrice,productServiceCharge);
	       // product.setSerielNo(product.getSerielNo() + 1);
	      //  product.setSerielNoOriginal(product.getSerielNo());
	       // return product;
	          product.setProductCode(productCode); 
	          product.setProductName(productName);
	          product.setProductDescription(productDescription);
	          return product;



	   }

public static void displayProductDetails(ArrayList<Product> productList) {



   System.out.println("Product Name " +"\t\t" + "Product Code" + "\t\t"
            + "Product Description" + "\t\t" + "Product Price" );
    for (Product product : productList) {
        if (product != null)
            System.out.println(product.getProductName() + "\t\t"
                    + product.getProductCode() + " \t\t" + product.getProductDescription() + "\t\t"
                    + product.getProductPrice());
    }
}
    public static Customer buyProduct(ArrayList<Product> customerProductList, ArrayList<Product> productList, int item)
    	{
    	Scanner scanner = new Scanner(System.in);
    	String productId;
    	System.out.println("Enter the product ID");
    	productId=scanner.nextLine();
    	String customerCode=null;
    	String customerName=null;
    	String productPurchaseDate=null;
    	Customer customer = new Customer(customerCode,customerName , productPurchaseDate, productList);
    	for (Product product : productList)
    	{
    		if (productId.equalsIgnoreCase(product.getProductCode()))	
    		{
    			if(item==1)
    			{
    				System.out.println("Enter Customer Code - ");
    				customerCode = scanner.nextLine();
    		        System.out.println("Enter Customer Name - ");
    		        customerName = scanner.nextLine();
    		        System.out.println("Enter Product Purchase Date");
    		        productPurchaseDate = scanner.nextLine();
    		        
    			
    			//Customer customer = new Customer(customerCode,customerName , productPurchaseDate, productList);
    			  customer.setCustomerCode(customerCode);
		          customer.setCustomerName(customerName);
		          customer.setProductPurchaseDate(productPurchaseDate);
		          customer.setProductList(productList);
    			System.out.println("Product purchase completed");
    			}
    			else
    			{
    				System.out.println("Enter Customer Code - ");
    			     customerCode = scanner.nextLine();
    		        System.out.println("Enter Customer Name - ");
    		        customerName = scanner.nextLine();
    		        System.out.println("Enter Product Size");
    		        productPurchaseDate = scanner.nextLine();
    
    		      //Customer customer = new Customer(customerCode,customerName , productSize, productList);
    		      customer.setCustomerCode(customerCode);
    		      customer.setCustomerName(customerName);
    		      customer.setProductPurchaseDate(productPurchaseDate);
    		      customer.setProductList(productList);
      			  System.out.println("Product purchase completed");
    			}
    		}
    
    		else
    		{
    			System.out.println("Invalid Product ID");
    		}
    	
    	
    	}
    	return customer;
    	}	



    
    public static void productRepair(ArrayList<Product> productList,ArrayList<Product> customerProductList, int item)
    {
    	Scanner scanner = new Scanner(System.in);
    	String productId;
    	System.out.println("Enter the product ID");
    	productId=scanner.nextLine();
    	for (Product product : productList)
    	{
    		if (productId.equalsIgnoreCase(product.getProductCode()))	
    		{
    			
    			System.out.println("Service Charge="+product.getProductServiceCharge());
    		}
    		else
    		{
    			System.out.println("Invalid Product ID");
    		}
    	
    	
    	}
    }
    public static void productExchange(ArrayList<Product> productList,ArrayList<Product> customerProductList, int item)
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the expiry Date:");
    	String expiryDate=scanner.nextLine();
    	System.out.println("Enter the Product ID:");
    	String inputProductID=scanner.nextLine();
    	for (Product product : productList)
    	{
    		if (inputProductID.equalsIgnoreCase(product.getProductCode()))	
    		{
    			
    		}
    	}
    	
    	
    }
    public static void warrentyExchange(ArrayList<Product> productList,ArrayList<Product> customerProductList, int item)
    {
    	
    }



}
