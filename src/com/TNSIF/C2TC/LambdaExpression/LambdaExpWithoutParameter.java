package com.TNSIF.C2TC.LambdaExpression;

public class LambdaExpWithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Statement st = () -> "Hello World!";
        
        System.out.println(st.show());
	}

}
