package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class ParityChecking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number to be checked: ");
		int numbertoCheck = 0;
		numbertoCheck = scanner.nextInt();
		//System.out.println(numbertoCheck);
		
		//to find last digit
		
		int lastDigit=0;
		
		lastDigit = numbertoCheck%10;
		System.out.println("Last Digit is: ");
		System.out.println(lastDigit);
		
		//to check parity
		if((lastDigit%2)==0)
		{
			
			System.out.println("Number is even");
			
		}
		else if((lastDigit%2)!=0)
		{
			System.out.println("Number is odd");
		}
		else
		{
			System.out.println("Number is zero");
		}
			
		
		
		
		
		

	}

}
