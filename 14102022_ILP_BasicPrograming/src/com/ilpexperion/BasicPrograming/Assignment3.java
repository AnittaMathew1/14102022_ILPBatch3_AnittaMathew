package com.ilpexperion.BasicPrograming;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		int temp;
		System.out.println("Enter Number");
		number=scanner.nextInt();
		temp=number%2;
		if(temp!=0)
		{
			System.out.println("Number is Odd");
		}
		else
		{
			System.out.println("Number is Even");
		}
	}

}
