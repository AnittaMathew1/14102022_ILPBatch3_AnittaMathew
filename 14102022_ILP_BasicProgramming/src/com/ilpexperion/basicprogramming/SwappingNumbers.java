package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;
		int tempNumber = 0;
		
		System.out.println("Enter first number");
		firstNumber = scanner.nextInt();
		
		
		System.out.println("Enter second number");
		secondNumber = scanner.nextInt();
		
		System.out.println("First Number=  ");
		System.out.println(firstNumber);
		System.out.println("Second Number =  ");
		System.out.println(secondNumber);
		
		tempNumber = secondNumber;
		//System.out.println("C: ");
		//System.out.println(tempNumber);
		
		secondNumber = firstNumber;
		firstNumber = tempNumber;
		System.out.println("After Swapping");
		
		
		
		
		System.out.println("First Number swapped =  ");
		System.out.println(firstNumber);
		
		System.out.println("Second Number swapped =  ");
		System.out.println(secondNumber);
		
		
		
		
		
		
		
		
		
		
		

	}

}
