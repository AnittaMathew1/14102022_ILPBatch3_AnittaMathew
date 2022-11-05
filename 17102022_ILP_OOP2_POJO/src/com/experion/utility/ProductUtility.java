package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product(); //created obj 1
		Service service = new Service();
		service.inputProductDetails();
		service.displayProductDetails();
		
		
		
		
	}

}
