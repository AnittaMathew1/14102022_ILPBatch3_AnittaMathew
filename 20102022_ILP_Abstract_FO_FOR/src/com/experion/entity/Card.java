package com.experion.entity;

import com.experion.service.AccountCardServices;

//import java.util.ArrayList;

public class Card extends Product implements AccountCardServices {
	private String cardNumber;
	private double cardBalance;
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void checkBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Check balance initiated");
	}
	@Override
	public void cashWithdrawal() {
		System.out.println("Cash withdrawel initiated");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		
	}

	
	
	}
	
