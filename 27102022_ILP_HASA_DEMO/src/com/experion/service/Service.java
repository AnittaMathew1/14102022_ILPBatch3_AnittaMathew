package com.experion.service;

import com.experion.entity.Address;
import com.experion.entity.Employee;

public class Service {

	

	public static Employee createEmployee() {
		Address address = new Address("TVM");
		Employee employee = new Employee("Anjima",address);
		return employee;
		
	}

	public static void displayEmployeeDetails(Employee employee) {
		System.out.println("Name"+"City");
		System.out.println(employee.getEmployeeName() +employee.getAddress().getCityName());
		
	}

}
