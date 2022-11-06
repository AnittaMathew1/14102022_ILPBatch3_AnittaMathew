package com.experion.entity;

public class Cards extends Product {
	
	private String cardType;

	public Cards(String productCode, String productName, String productType, String cardType) {
		super(productCode, productName, productType);
		this.cardType = cardType;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	

}
