package com.TNSIF.C2TC.dayfive;

import java.util.Scanner;

public class studentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
        char initial;
        int mark1,mark2;
        double cgpa;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = in.nextLine();
        System.out.println("Enter initial : ");
        initial = in.next().charAt(0);
        System.out.println("Enter mark1 : ");
        mark1 = in.nextInt();
        System.out.println("Enter mark2 : ");
        mark2 = in.nextInt();
        System.out.println("Enter cgpa : ");
        cgpa = in.nextDouble();
        System.out.println("----------------");
        System.out.println("Name: "+name+" "+initial+"\n"+"Mark 1:"+mark1+"\nMark 2:"+mark2+"\nCGPA: "+cgpa );
	}
	

}
