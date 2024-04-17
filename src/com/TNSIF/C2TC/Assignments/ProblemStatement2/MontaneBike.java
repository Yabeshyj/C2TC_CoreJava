package com.TNSIF.C2TC.Assignments.ProblemStatement2;

public class MontaneBike extends Bicycle
{
	public int seatHeight;

	public String toString() 
	{
		return "No of gears are "+noOfGears+"\nSpeed of bicycle is "+speed+"\nSeat height is "+seatHeight;
	}

	public MontaneBike(int noOfGears, int speed, int seatHeight) {
		super(noOfGears, speed);
		this.seatHeight = seatHeight;
	}
}
