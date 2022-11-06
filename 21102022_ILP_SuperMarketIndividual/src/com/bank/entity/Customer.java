package com.bank.entity;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private ArrayList<Account> accountList;
	private String customerCode;
	public Customer(String customerName, ArrayList<Account> accountList, String customerCode) {
		super();
		this.customerName = customerName;
		this.accountList = accountList;
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	
}
