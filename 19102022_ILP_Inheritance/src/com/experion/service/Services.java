package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Cards;
import com.experion.entity.Product;

public class Services {

	public static Product createProduct(String productType) {
		ArrayList<BankServices> bankServices=new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100","Online Banking"));
		bankServices.add(new BankServices("SOB101","Mobile Banking"));
		bankServices.add(new BankServices("SOB100","Cash Deposit"));
		
		
		Product product = null;
		if (productType.compareTo("Cards") == 0) {
			product = new Cards("MA101", "Mater Card", "Debit Cards", "Visa Cards");
		} 
		else if (productType.compareTo("Accounts") == 0) {
			product = new Account("AC101", "Savings Account", "NRI Account", "Senior Citizen Account",bankServices);
		}
		return product;

	}

	/*
	 * public static void createAccountProduct() { // TODO Auto-generated method
	 * stub
	 * 
	 * 
	 * }
	 * 
	 * public static void buyProduct() { // TODO Auto-generated method stub
	 * //System.out.println("1. Buy Account/t/t 2.Buy Card");
	

	} */

	public static void displayProductdetails(ArrayList<Product>productList) {
		// TODO Auto-generated method stub
		Cards cards = null;
		Account account = null;
		System.out.println("Product Code"+"		"+"Product Name"+"		"		+"Product Type"+"		"+"Account/Card");

		for(Product product: productList)
		{
			if(product instanceof Cards)
			{
				cards= (Cards)product;
				
				System.out.println(cards.getProductCode()+"		"+cards.getProductName()+"		"+cards.getProductType());
			}
			else if(product instanceof Account)
			{
				account= (Account)product;
				System.out.println(account.getProductCode()+"		"+"		"+account.getProductName()+"		"+account.getProductType());
				System.out.println("The list of services are given below");
				for(BankServices bankServices : account.getBankServices())
					System.out.println(bankServices.getServiceName());
			}
			
		
	}
		
}
}
