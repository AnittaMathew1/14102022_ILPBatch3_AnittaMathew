package com.experion.entity;

import java.util.Date;

import com.experion.service.FabricService;

public class Fabrics extends Product implements FabricService {

	public Fabrics(String productCode, String productName, double productPrice,double productServiceCharge) {
		super(productCode, productName, productPrice,productServiceCharge);

	}

	@Override
	public void productExchange() {
		
		System.out.println("Fabric product exchanged");
		
	}

}
