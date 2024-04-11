package com.TNSIF.C2TC.daythree;

public class Person {

	//DataMembers
	
	private String name;
	private int age;
	private int income;
	private int tax;
	private String gender;
	
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
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", income=" + income + ", tax=" + tax + ", gender=" + gender
				+ "]";
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
