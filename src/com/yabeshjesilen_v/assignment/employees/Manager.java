package com.yabeshjesilen_v.assignment.employees;

public class Manager extends Employee{
	
	public String teamName;
	protected int performanceRating;
	private int totalProjectsManaged;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	public int getTotalProjectsManaged() {
		return totalProjectsManaged;
	}
	public Manager(String name, int age, double salary, int employeeId, String teamName, int performanceRating,
			int totalProjectsManaged) {
		super(name, age, salary, employeeId);
		this.teamName = teamName;
		this.performanceRating = performanceRating;
		this.totalProjectsManaged = totalProjectsManaged;
	}
	public void setTotalProjectsManaged(int totalProjectsManaged) {
		this.totalProjectsManaged = totalProjectsManaged;
	}
}
