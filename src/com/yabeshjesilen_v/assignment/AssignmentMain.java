package com.yabeshjesilen_v.assignment;

import com.yabeshjesilen_v.assignment.employees.*;
import com.yabeshjesilen_v.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Developer dev= new Developer("Yabesh",20,Employee.totalEmployees+1,40000.00,"Yabeshyj",2);
			System.out.println(EmployeeUtilities.gitHubLink(dev));
			Manager man=new Manager("Yash",20,Employee.totalEmployees+1,55876.00,"toast",3,6);
			System.out.println(EmployeeUtilities.salaryDifference(dev, man));
			EmployeeUtilities.printBasicDetails(man);
	}

}
