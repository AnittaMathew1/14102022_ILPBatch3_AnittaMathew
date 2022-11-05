package com.experion.assignment;

import java.util.Scanner;

public class DescendingOrderqn1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber = 0; //declaring and initializing variables
		int secondNumber = 0;
		int thirdNumber = 0;
		firstNumber = scanner.nextInt();	//user input
		secondNumber = scanner.nextInt();	
		thirdNumber = scanner.nextInt();
		//finding largest number
		if(firstNumber>secondNumber && firstNumber>thirdNumber)
		{
			System.out.print(firstNumber +"	");
			
		}
		else if(secondNumber>firstNumber && secondNumber>thirdNumber)
		{
			System.out.print(firstNumber +"	");
		}
		else if(thirdNumber>firstNumber && thirdNumber>secondNumber)
		{
			System.out.print(thirdNumber+" ");
		}
		//finding second largest number
		if((firstNumber>secondNumber && firstNumber<thirdNumber) || (firstNumber<secondNumber && firstNumber>thirdNumber))
		{
			System.out.print(firstNumber +"  ");
			
		}
		else if((secondNumber<firstNumber && secondNumber>thirdNumber) || secondNumber>firstNumber && secondNumber<thirdNumber)
		{
			System.out.print(secondNumber +"	");
		}
		else if((thirdNumber>firstNumber && thirdNumber<secondNumber) || (thirdNumber<firstNumber && thirdNumber>secondNumber))
		{
			System.out.print(thirdNumber +" 	");
		}
		//to find smaller number
		
		if(firstNumber<secondNumber && firstNumber<thirdNumber)
		{
			System.out.print(firstNumber);
		}
		else if(firstNumber>secondNumber && secondNumber<thirdNumber)
		{
			System.out.print(secondNumber);
		}
		else if(firstNumber>thirdNumber && secondNumber>thirdNumber)
		{
			System.out.print(thirdNumber);
		}

	}

}
