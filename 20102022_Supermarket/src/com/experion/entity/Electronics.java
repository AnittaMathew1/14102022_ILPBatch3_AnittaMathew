package com.experion.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.service.ElectronicService;

public class Electronics extends Product implements ElectronicService {

	private int serviceCharge;
	private Date warrantyDate;


	
	public Electronics(String productCode, String productName, double productPrice, double productServiceCharge,
			int serviceCharge, Date warrantyDate) {
		super(productCode, productName, productPrice, productServiceCharge);
		this.serviceCharge = serviceCharge;
		this.warrantyDate = warrantyDate;
	}

	@Override
	public void ProductRepair(ArrayList<Product> productList) {
		Scanner scanner=new Scanner(System.in);
		String inputProductID;
		System.out.println("Enter the Product ID");
		inputProductID=scanner.nextLine();
		for (Product product : productList)
		{
			if (inputProductID.equalsIgnoreCase(product.getProductCode()))	
			{
				System.out.println("Repair product service provided.");
				System.out.println("Service Charge:"+product.getProductServiceCharge());
			}
		}
		
		
	}

	@Override
	public void warrantyReplacement() {
		
		System.out.println("Your product approved for replacement.");
		
	}
	@Override
	public void warrantyExtend() {
		
		System.out.println("Your product warrenty extended by 2 years.");
		
	}

	public int getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Date getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(Date warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	@Override
	public void ProductRepair() {
		// TODO Auto-generated method stub
		System.out.println("Product Repair done");
		System.out.println("Your service charge is " + getServiceCharge());
		
	}

		// TODO Auto-generated method stub
		

	

	
}
