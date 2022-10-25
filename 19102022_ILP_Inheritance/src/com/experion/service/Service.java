package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankingServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {
	

	public static Product addCard(String productType) {
		// TODO Auto-generated method stub
		ArrayList<BankingServices>bankingServices=new ArrayList<BankingServices>();
		Product product=null;
		bankingServices.add(new BankingServices("SOB101","Online Banking"));
		bankingServices.add(new BankingServices("SOB100","Mobile Banking"));
		bankingServices.add(new BankingServices("SOB102","Cash Deposit"));
		if(productType.compareTo("Card")==0)
		{
			product=new Card("PRDMC100","Master Cards","Cards","Master",bankingServices);
		}
		
		else if(productType.compareTo("Accounts")==0)
		{
			product=new Account("PRDWSA100","Womens Svings Account","Account","Womens Savings Account",bankingServices);
		    //System.out.println(product.getProductCode());
		}
		return product;
		
		
	}

	public static void displayProductDetails(ArrayList<Product> productList) {
		Card card;
		Account account;
		//ArrayList<BankingServices>bankingServices=new ArrayList<BankingServices>();
		System.out.println("Product Code"+"			"+"Product Name"+"			"+"	Product Type"+"			"+"Account/Card");
		for(Product product:productList)
		{
			if(product instanceof Card)
			{
				card=(Card)product;
				System.out.println(card.getProductCode()+"		"+card.getProductName()+"		"+card.getProductType()+""+card.getCardType());
				System.out.println("Services are given below:");
				for(BankingServices bankingServices: card.getBankingServices())
					
			
					System.out.println(bankingServices.getServiceName());
			
			}
			else if(product instanceof Account)
			{
				account=(Account)product;
				
				System.out.println(account.getProductCode()+"		"+account.getProductName()+"		"+account.getProductType()+""+account.getAccountType());
				System.out.println("Services are given below:");
				for(BankingServices bankingServices: account.getBankingServices())
					
			
					System.out.println(bankingServices.getServiceName());
			
			}
		}
		// TODO Auto-generated method stub
		
	}
	

}
