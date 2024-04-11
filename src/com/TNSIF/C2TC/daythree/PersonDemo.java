package com.TNSIF.C2TC.daythree;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		String name;
		System.out.println("Enter Name : ");
		name=s.next();
		int age;
		System.out.println("Enter Age : ");
		age=s.nextInt();
		String gender;
		System.out.println("Enter Gender : ");
		gender=s.next();
		int tax;
		System.out.println("Enter Tax : ");
		tax=s.nextInt();
		int income;
		System.out.println("Enter Income : ");
		income=s.nextInt();
		Person p1=new Person();
		p1.setAge(age);
		p1.setName(name);
		p1.setIncome(income);
		p1.setTax(tax);
		p1.setGender(gender);
		System.out.println(p1);
	}

}
