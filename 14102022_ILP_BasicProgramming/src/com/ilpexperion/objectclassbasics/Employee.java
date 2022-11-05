package com.ilpexperion.objectclassbasics;

public class Employee {
	
	String employeeName="Anjima"; //member variables
	int employeeAge=22;
	char employeeGender='m';
	double employeeCgpa=8.6;
	
	public void displayEmployeeDetails(){
		System.out.println("Name"+ "   " + "Age"   + "Gender"  +"cgpa");//+used for concatenation
	    System.out.println(employeeName+"   "+employeeAge+"   "+employeeGender+"   "+employeeCgpa);
		
	}

}
