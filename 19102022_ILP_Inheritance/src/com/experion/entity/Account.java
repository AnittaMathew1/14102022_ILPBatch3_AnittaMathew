package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {
	private String accountType;
	//private BankingServices bankingServices;
	ArrayList<BankingServices>bankingServices=new ArrayList<BankingServices>();
	
	
	
	public Account(String productCode, String productName, String productType, String accountType,
			ArrayList<BankingServices> bankingServices) {
		super(productCode, productName, productType);
		this.accountType = accountType;
		this.bankingServices = bankingServices;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public ArrayList<BankingServices> getBankingServices() {
		return bankingServices;
	}
	public void setBankingServices(ArrayList<BankingServices> bankingServices) {
		this.bankingServices = bankingServices;
	}
	

	
	}
	
