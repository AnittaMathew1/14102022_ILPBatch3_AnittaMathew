package com.ilpexperion.BasicPrograming;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		int temporary;
		System.out.println("Enter Number1 = ");
		num1=scanner.nextInt();
		System.out.println("Enter Number2 = ");
		num2=scanner.nextInt();
		System.out.println("Before Swapping\nNumber1 ="+num1+"	Number2 ="+num2);
		temporary=num1;
		num1=num2;
		num2=temporary;
		System.out.println("After Swapping\nNumber1 ="+num1+"	Number2 ="+num2);
		
	}

}
