package com.ilpexperion.BasicPrograming;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 ;
		int num2;
		System.out.println("Enter Number1 = ");
		num1=scanner.nextInt();
		System.out.println("Enter Number2 = ");
		num2=scanner.nextInt();
		System.out.println("Before Swapping\nNumber1 ="+num1+"	Number2 ="+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping\nNumber1 ="+num1+"	Number2 ="+num2);

	}

}
