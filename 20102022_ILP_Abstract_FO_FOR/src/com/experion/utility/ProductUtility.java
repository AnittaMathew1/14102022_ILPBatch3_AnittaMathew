package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] arg)
	{
		Product product=null;
		/*Account account=new Account("WOMENS SAVING NUMBER","ACC100023",10000);
		AccountService accountService= new AccountService();
		accountService.depositCash(account,1000);
		accountService.depositCash(account,1000,"ANITTA@YBL");
		accountService.depositCash(account,"CHQ19987",1000);*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Account\n2.Card\n3.Loan");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			//Account account=Account(product);
			product=new Account("Womens Account","AS1000",10000);
			
		}
		else if(choice==2)
		{
			product=new Card("Master Card","MS1000",10000);
			Card card=(Card)product;
			card.cashWithdrawal();
			card.checkBalance();
		}
		else if(choice==3)
		{
			product=new Loan("Home Loan","MD1000",10000);
		}
		product.checkProductValidity();
	}
}

