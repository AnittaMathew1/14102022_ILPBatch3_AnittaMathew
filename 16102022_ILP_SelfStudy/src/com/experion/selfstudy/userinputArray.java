package com.experion.selfstudy;

import java.util.Scanner;

public class userinputArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput[]=new int[5];
		int i =0;
		for(i=0;i<userInput.length;i++)
		{
			userInput[i]=scanner.nextInt();
		}
		int numbertoFind=0;
		numbertoFind=scanner.nextInt();
		
		for(i=0;i<userInput.length;i++)
		{
			if(userInput[i]==numbertoFind)
			{
				System.out.print("Index of the given number is:"+i);
			}
		}

	}

}
