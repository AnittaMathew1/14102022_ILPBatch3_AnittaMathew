package com.experion.assignment;

public class onetoFourpatternPrinting {
	public static void printNums(int n) {
	int i=0;
	int j=0;
	int num=0;
    
    for(i=0; i<n; i++) // outer loop for rows
    { 
        num=1; 
        for(j=0; j<=i; j++) // inner loop for rows
        { 
            // printing num with a space  
            System.out.print(num+ " "); 

            //incrementing value of num 
            num++; 
        } 

        // ending line after each row 
        System.out.println(); 
    }
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; 
        printNums(n); 

	}

}
