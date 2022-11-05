package com.experion.assignment;

import java.util.Scanner;

public class WordsinaString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 String str = scanner.nextLine();
		 
	        int count = 1;
	 
	        for (int i = 0; i < str.length() - 1; i++)
	        {
	            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of words in a string : " + count);
	    }

	}


