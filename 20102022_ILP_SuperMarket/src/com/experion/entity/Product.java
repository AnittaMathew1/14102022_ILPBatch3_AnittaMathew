package com.experion.entity;

public class Product {
	//private int serielNoOriginal;
    private String productCode;
    private String productName;
    private String productDescription;
    private double productPrice;
    private double productServiceCharge;
   // private static int serielNo=0;
	//public int getSerielNoOriginal() {
		//return serielNoOriginal;
    
	public String getProductCode() {
		return productCode;
	}
	public Product(String productCode, String productName, String productDescription, double productPrice,
		double productServiceCharge) {
	super();
	this.productCode = productCode;
	this.productName = productName;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
	this.productServiceCharge = productServiceCharge;
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
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductServiceCharge() {
		return productServiceCharge;
	}
	public void setProductServiceCharge(double productServiceCharge) {
		this.productServiceCharge = productServiceCharge;
	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	/*public static int getSerielNo() {
		return serielNo;
	}
	public static void setSerielNo(int serielNo) {
		Product.serielNo = serielNo;
	}	*/				//getters&setters
    
    

}
