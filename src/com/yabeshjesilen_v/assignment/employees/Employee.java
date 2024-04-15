package com.yabeshjesilen_v.assignment.employees;

public class Employee
{
	public String name;
	private int age;
	private double salary;
	int employeeId;
	public Employee(String name, int age, double salary, int employeeId) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.employeeId = employeeId;
	}
	public static int totalEmployees=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}
