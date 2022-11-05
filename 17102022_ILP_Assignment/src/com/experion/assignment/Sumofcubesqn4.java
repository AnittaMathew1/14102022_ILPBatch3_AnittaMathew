package com.experion.assignment;

import java.util.Scanner;

public class Sumofcubesqn4 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	//sumofcubes
	double sum = (((n+1)*(n+1)*n*n)/4);
	System.out.println(sum);

	}

}
