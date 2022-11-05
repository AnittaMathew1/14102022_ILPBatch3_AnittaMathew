package com.experion.assignment;

import java.util.Scanner;

public class occurrenceofanElement {

	public static void main(String[] args) {
		int nofElements=0;
		int elementTofind=0;
		int count = 0;
		int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        nofElements = scanner.nextInt();
        int a[] = new int[nofElements];
        System.out.println("Enter all the elements:");
        for(i = 0; i < nofElements; i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        elementTofind= scanner.nextInt();
        for(i = 0; i < nofElements; i++)
        {
            if(a[i] == elementTofind)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }

	}


