package com.ilpexperion.BasicPrograming;

import java.util.Scanner;

public class DetailsScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("**********Welcome to ILP Program**********");
		
		String name;
		int age;
		char gender;
		double cgpa;
		
		System.out.println("Enter Name = ");
		name=scanner.nextLine();
		System.out.println("Enter Age = ");
		age=scanner.nextInt();
		System.out.println("Enter Gender = ");
		gender=scanner.next().charAt(0);
		System.out.println("Enter CGPA = ");
		cgpa=scanner.nextDouble();
		System.out.println(name+"			"+age+"		"+gender+"		"+cgpa);
		
		

	}

}
