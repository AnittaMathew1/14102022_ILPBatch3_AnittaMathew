package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwappingNumbersWithoutConstant {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;
		
		
		
		System.out.println("Enter first number");
		firstNumber = scanner.nextInt();
		
		
		System.out.println("Enter second number");
		secondNumber = scanner.nextInt();
		
		System.out.println("First Number=  ");
		System.out.println(firstNumber);
		System.out.println("Second Number =  ");
		System.out.println(secondNumber);
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber-secondNumber;
		firstNumber = firstNumber-secondNumber;
		
System.out.println("After Swapping");
		
		
		
		
		System.out.println("First Number swapped =  ");
		System.out.println(firstNumber);
		
		System.out.println("Second Number swapped =  ");
		System.out.println(secondNumber);
		

	}

}
