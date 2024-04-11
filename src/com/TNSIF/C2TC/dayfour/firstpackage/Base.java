package com.TNSIF.C2TC.dayfour.firstpackage;

public class Base 
{
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault()
	{
		System.out.println("Default Access modifier");
		System.out.println("Default Variable: "+varDefault);
	}
	void methodPublic()
	{
		System.out.println("Public Access modifier");
		System.out.println("Public Variable: "+varPublic);
	}
	void methodPrivate()
	{
		System.out.println("Private Access modifier");
		System.out.println("Private Variable: "+varPrivate);
	}
	void methodProtected()
	{
		System.out.println("Protected Access modifier");
		System.out.println("Protected Variable: "+varProtected);
	}
}