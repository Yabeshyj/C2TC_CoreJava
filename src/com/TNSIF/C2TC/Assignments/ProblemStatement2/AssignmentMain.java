package com.TNSIF.C2TC.Assignments.ProblemStatement2;

import java.util.Scanner;

public class AssignmentMain {

			
		public static void main(String[] args) 
		{
	        Scanner in = new Scanner(System.in);
	        System.out.println();
	        int noOfGears;
	        int speed;
	        int seatHeight;   
	        noOfGears = in.nextInt();
	        speed = in.nextInt();
	        seatHeight = in.nextInt();
	        MontaneBike bike = new MontaneBike(noOfGears,speed,seatHeight);
	        System.out.println(bike);
		}
	

}
