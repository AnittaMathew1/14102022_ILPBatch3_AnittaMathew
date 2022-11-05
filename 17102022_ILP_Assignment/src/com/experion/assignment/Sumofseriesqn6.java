package com.experion.assignment;

import java.util.Scanner;

public class Sumofseriesqn6 {
	Scanner scanner = new Scanner(System.in);
	
	 public static double sumOfSeries(double num)
	    {
	        double res = 0, fact = 1;
	        for (int i = 1; i <= num; i++)
	        {
	            // fact variable store
	            // factorial of the i
	            fact = fact * i;
	 
	            res = res + (i / fact);
	        }
	        return(res);
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
        System.out.println("Sum: " + sumOfSeries(n));

	}

}
