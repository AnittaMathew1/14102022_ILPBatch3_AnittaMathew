package com.experion.basicprogramming;

import java.util.Scanner;

public class vowelChecking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char alphatoCheck= scanner. next().charAt(0);
		switch(alphatoCheck)
		{
		case 'a': 
			
			System.out.println("Given alphabet is vowel");
		    break;
		    
		 case 'e': 
			
			System.out.println("Given alphabet is vowel");
			 break;
			    
		 case 'i': 
			
			System.out.println("Given alphabet is vowel");
			break;
			
			case 'o': 
				
				System.out.println("Given alphabet is vowel");
			    break;
			    
			  case 'u': 
				
				System.out.println("Given alphabet is vowel");
				break;
				
				
			default:
				System.out.println("Its not a vowel");
		
		}

	}



	}


