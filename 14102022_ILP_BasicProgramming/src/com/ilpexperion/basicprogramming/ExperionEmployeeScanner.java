package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class ExperionEmployeeScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String employeeName;
		int employeeAge;
		char employeeGender;
		double employeeCgpa;

		System.out.println("Enter your Employee Name:");
		employeeName = scanner.nextLine();

		System.out.println("Enter your Employee Age:");
		employeeAge = scanner.nextInt();

		System.out.println("Enter your Employee Gender:");
		employeeGender = scanner.next().charAt(0);

		System.out.println("Enter your Employee CGPA:");
		employeeCgpa = scanner.nextDouble();

		System.out.println("Name" + "   " + "Age" + "Gender" + "cgpa");// +used for concatenation
		System.out.println(employeeName + "   " + employeeAge + "   " + employeeGender + "   " + employeeCgpa);

	}

}
