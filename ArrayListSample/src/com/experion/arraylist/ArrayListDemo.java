package com.experion.arraylist;

import java.util.ArrayList;

import com.experion.entity.Product;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product("PRD100","Watch"));
		productList.add(new Product("PRD101","Laptop"));
		productList.add(new Product("PRD102","Radio"));
		
		
		
	}

}
