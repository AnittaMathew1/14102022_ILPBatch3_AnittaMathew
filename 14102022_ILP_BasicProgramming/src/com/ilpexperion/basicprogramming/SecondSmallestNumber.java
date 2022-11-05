package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int thirdNumber = scanner.nextInt();
		
		if(((firstNumber<secondNumber) && (firstNumber>thirdNumber)) || ((firstNumber>secondNumber) && (firstNumber<secondNumber)))
		{
			System.out.println("Firstnumber");
		}
		
		else if (((secondNumber<firstNumber) && (secondNumber>thirdNumber)) || ((secondNumber>firstNumber) && (secondNumber<thirdNumber)))
		{
			
			System.out.println("SecondNumber");
		}
		else
		{
			System.out.println("ThirdNumber");
		}
		
		

	}

}
