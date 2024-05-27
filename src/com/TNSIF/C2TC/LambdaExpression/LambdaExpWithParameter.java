package com.TNSIF.C2TC.LambdaExpression;

public class LambdaExpWithParameter {

	public static void main(String[] args)
	{
	    Message mes = (name) -> System.out.println("Hello,"+name);
	    mes.greet("Yabesh");
        addition sum = (a,b) -> a+b;
        System.out.println(sum.add(1,20));
	}

}