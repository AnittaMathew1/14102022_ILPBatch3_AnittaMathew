package com.experion.entity;

public class Employee {
	private String employeeName;
	Address address;
	
	public Employee(String employeeName, Address address) {
		
		this.employeeName = employeeName;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
