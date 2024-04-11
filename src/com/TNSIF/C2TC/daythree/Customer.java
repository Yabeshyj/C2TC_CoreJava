package com.TNSIF.C2TC.daythree;

public class Customer 
{
	private String customerName;
	private int customerId;
	private String customerCity;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String CustomerName) {
		this.customerName = CustomerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int CustomerId) {
		this.customerId = CustomerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String CustomerCity) {
		this.customerCity = CustomerCity;
	}
public Customer(String CustomerName, int CustomerId, String CustomerCity) {
		
		this.customerName = CustomerName;
		this.customerId = CustomerId;
		this.customerCity =CustomerCity;
	}
	
}
