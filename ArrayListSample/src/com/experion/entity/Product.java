package com.experion.entity;

public class Product {
	
	String productCode;
	String productName;
	public Product(String productCode, String productName) {
		
		this.productCode = productCode;
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	

}
