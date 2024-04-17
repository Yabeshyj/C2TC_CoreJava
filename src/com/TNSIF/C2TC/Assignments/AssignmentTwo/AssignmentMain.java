package com.TNSIF.C2TC.Assignments.AssignmentTwo;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student(); 
		Commission com = new Commission();
		com.enterDetails();
        System.out.println(com.calculateCommission());
        Circle cr = new Circle();
        cr.getInput();
        System.out.println(cr.calcArea()); 
	}

}
