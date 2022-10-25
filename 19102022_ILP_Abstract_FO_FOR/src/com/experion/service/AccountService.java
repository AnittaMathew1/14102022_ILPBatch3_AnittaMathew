package com.experion.service;

import com.experion.entity.Account;

public class AccountService {
	
	public void depositCash(Account account,double amount) 
	{
		System.out.println("Depositing money over the counter");
	}
	public void depositCash(Account account,String chequeNo,double amount)
	{
		System.out.println("Depositing money via cheque");
	}
	public void depositCash(Account account,double amount,String upi) 
	{
		System.out.println("Depositing money via online transfer");
	}
	

}
