package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;
import com.experion.service.AccountServices;

public class BankUtility {

	public static void main(String[] args) {
		/*Account account = new Account("Womens Savings Account","ACC123",10000);
		AccountServices accountService = new AccountServices();
		accountService.depositCash(account, 2000);
		accountService.depositCash(account,0,"anjimasadasivan@xyz.com");
		accountService.depositCash(account, "CGQ123",2000);*/
		
		
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.ACCOUNT 2.CARD 3.LOAN");
		int choice = scanner.nextInt();
		if(choice==1)
		{
			product = new Account("Womens Savings ACC","ACC098",10000);
			
		}
		else if(choice==2)
		{
			product = new Card(" Master CARD","CARD1010",10000);
			Card card = (Card)product;
			card.cashWithdraw();
			card.checkBalance();
		}
		else if(choice==3)
		{
			product = new Loan("Home LOan","Loan2020",1000000);
			Loan loan = (Loan)product;
			loan.checkdueDate();
			loan.checkProductValidity();
		}
		product.checkProductValidity();
		
		
		

	}

}
