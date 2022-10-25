package com.experion.entity;

import java.util.ArrayList;

public class Customer {
	private String customerCode;
	private String customerName;
	private String productPurchaseDate;
	private ArrayList<Product> productList;

	public Customer(String customerCode, String customerName, String productPurchaseDate,
			ArrayList<Product> productList) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.productPurchaseDate = productPurchaseDate;
		this.productList = productList;
	}
	public String getProductPurchaseDate() {
		return productPurchaseDate;
	}
	public void setProductPurchaseDate(String productPurchaseDate) {
		this.productPurchaseDate = productPurchaseDate;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
	

}
