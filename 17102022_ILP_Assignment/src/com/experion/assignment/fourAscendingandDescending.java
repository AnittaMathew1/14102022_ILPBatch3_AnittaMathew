package com.experion.assignment;

import java.util.Scanner;

public class fourAscendingandDescending {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];
		System.out.println("Enter the numbers:\n");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int temp = 0;

		// Displaying elements of original array
		System.out.println("Elements of original array: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in descending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	// Displaying elements of array after sorting
		System.out.println("\nElements of array sorted in descending order: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		 //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
        
     // Displaying elements of array after sorting
     		System.out.println("\nElements of array sorted in ascending order: \n");
     		for (int i = 0; i < arr.length; i++) {
     			System.out.print(arr[i] + " ");
     		}

	}

}
