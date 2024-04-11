package com.TNSIF.C2TC.daythree;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String name,city;
		int id;
		
		System.out.println("Enter customerId : ");
		id=s.nextInt();
		
		System.out.println("Enter customerName : ");
		name=s.nextLine();
		
		System.out.println("Enter customerCity : ");
		city=s.nextLine();
		
		Customer c = new Customer();
		c.setCustomerName(name);
		c.setCustomerId(id);
		c.setCustomerCity(city);
		
		System.out.println(c);
	}

}
