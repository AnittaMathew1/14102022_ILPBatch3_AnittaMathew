package com.experion.assignment;

import java.util.Scanner;

public class sumofSeriesqn3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = scanner.nextInt();
		int i = 1, c, f = 1; // i for odd nos, c for counter, f for flag
		for (c = 1; c <= n; c++) {
			if (f % 2 == 0) {
				System.out.print(-i + " ");
			} else {
				System.out.print(i + " ");
			}
			i += 2;
			f++;

		}
		  if(n%2==0)
		  {	  System.out.print("Sum of sequence:");
			  System.out.println("-"+n);
		  }
		  else
		  {   System.out.print("Sum of sequence:");
			  System.out.print(n);
		  }

	}
}
