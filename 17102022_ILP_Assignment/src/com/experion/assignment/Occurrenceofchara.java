package com.experion.assignment;

import java.util.Scanner;

public class Occurrenceofchara {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		String str = scanner.nextLine();
	       System.out.println("String = "+str);
	       System.out.println("Replacing all occurrence of given character...");
	       System.out.println("Updated string = "+str.replace("m", "c"));
		

	}

}
