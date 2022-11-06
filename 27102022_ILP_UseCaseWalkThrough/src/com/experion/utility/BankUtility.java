package com.experion.utility;

import com.experion.entity.Service;
import com.experion.service.BankService;

public class BankUtility {

	public static void main(String[] args) {
		
		Service service=BankService.createService();
		BankService.createRateCard(service);
        BankService.displayServiceDetails(service);

	}

}
