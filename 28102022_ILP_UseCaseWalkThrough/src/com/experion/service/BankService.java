package com.experion.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.experion.entity.Rate;
import com.experion.entity.Service;

public class BankService {

	public static Service createService() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the following details to create service");
		System.out.println("Service Code: -");
		String serviceCode = scanner.nextLine();
		System.out.println("Service Name: -");
		String serviceNmae = scanner.nextLine();
		System.out.println("Service Description: -");
		String serviceDescription = scanner.nextLine();
		System.out.println("Open Date: -");
		String openDate = scanner.nextLine();
		System.out.println("Validity Date: -");
		String validityDate = scanner.nextLine();
		System.out.println("Expiry Date: -");
		String expiryDate = scanner.nextLine();

		Date openDateConverted = stringToDate(openDate);
		Date validityDateConverted = stringToDate(validityDate);
		Date expiryDateConverted = stringToDate(expiryDate);

		Service service = new Service(serviceCode, serviceNmae, serviceDescription, openDateConverted,
				validityDateConverted, expiryDateConverted);
		return service;

	}

	public static void createRateCard(Service service) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********" + service.getServiceNmae() + "*********");
		System.out.println("Enter the no of tiers you want to add");
		int noofTiers = scanner.nextInt();
		int[] min = new int[noofTiers];
		int[] max = new int[noofTiers];
		double[] fees = new double[noofTiers];

		for (int tier = 0; tier < noofTiers; tier++) {
			System.out.println("Enter the MIN MAX and Rate for the" + (tier + 1) + "tier");
			min[tier] = scanner.nextInt();
			max[tier] = scanner.nextInt();
			fees[tier] = scanner.nextDouble();
			System.out.println("Successfully inserted values" + (tier + 1) + "tier");
			if(tier<noofTiers)
			{
				System.out.print("Do you want more tiers-(y/n)");
				char ch = scanner.next().charAt(0);
				if (ch == 'y')
					continue;
				else
					break;
			}
			
		}
		
		Rate rate = new Rate();
		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);

	}

	public static void displayServiceDetails(Service service) {
		System.out.println("********Service Details*********");
		System.out.println("service code"+"Service name"+"service description"+"open date"+"validity date"+"expiry date");
		System.out.println(service.getServiceCode()+service.getServiceNmae()+service.getServiceDesc()+service.getOpenDate()+service.getValidityDate()+service.getExpiryDate());
		System.out.println("********Rate Card for the service*********"+service.getServiceNmae()+"is given below");
		System.out.println("Min  Max  Rate");
		for(int index=0; index <service.getRate().getMin().length;index++)
		{
			System.out.println((service.getRate().getMax()[index]<=999999) &&(service.getRate().getMax()[index]!=0));
			System.out.println(service.getRate().getMax()[index]+"   "+service.getRate().getMax()[index]+"   "+service.getRate().getRate()[index] );
		}

	}

	public static Date stringToDate(String dateString) {
		Date convertedDate = null;
		try {
			convertedDate = (Date) new SimpleDateFormat("dd/mm/yy").parse(dateString);
			return convertedDate;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return convertedDate;

	}
}
