package com.experion.entity;

import java.util.ArrayList;

public class Card extends Product {
	private String cardType;
	ArrayList<BankingServices>bankingServices=new ArrayList<BankingServices>();
	
	
	
	public Card(String productCode, String productName, String productType, String cardType,
			ArrayList<BankingServices> bankingServices) {
		super(productCode, productName, productType);
		this.cardType = cardType;
		this.bankingServices = bankingServices;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public ArrayList<BankingServices> getBankingServices() {
		return bankingServices;
	}
	public void setBankingServices(ArrayList<BankingServices> bankingServices) {
		this.bankingServices = bankingServices;
	}
	
	
	
	

}
