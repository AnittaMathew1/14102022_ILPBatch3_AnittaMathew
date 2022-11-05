package com.experion.assignment;

import java.util.Scanner;

public class Sumofseriesqn8 {
	
	 public double factorial(int count1) {
	        double factVariable = 1;
	        for (int index = 1; index <= count1; index++) {
	            factVariable = factVariable * index;
	        }
	        return factVariable;
	    }
	 
	 public void displaySum() {



	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter range of the series");
	        int rangeVariable = scanner.nextInt();



	       double seriesSum = 0.0;
	        for (int count = 1; count <= rangeVariable; count++) {



	           seriesSum = seriesSum + (count / (Math.pow(count * count, count) + factorial(count)));
	            // System.out.println(seriesSum);
	        }
	        System.out.println("Sum of series is:" + seriesSum);
	       



	   }

	public static void main(String[] args) {
		
		Sumofseriesqn8  fact = new Sumofseriesqn8();
	        fact.displaySum();
	    }
		

	}


