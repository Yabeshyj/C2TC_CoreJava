package com.yabeshjesilen_v.assignment.employees;

public class Developer extends Employee 
{
	public String githubUserName;
	public Developer(String name, int age, double salary, int employeeId, String githubUserName, int currProject) {
		super(name, age, salary, employeeId);
		this.githubUserName = githubUserName;
		this.currProject = currProject;
	}
	public int currProject;
}
