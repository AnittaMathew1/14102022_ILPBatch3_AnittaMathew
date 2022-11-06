package com.experion.entity;

public class Account {
	private String accountType;
	private double accountBalance;
	private String customerCode;
	public Account(String accountType, double accountBalance) {
		super();
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.customerCode = customerCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	
	
}
