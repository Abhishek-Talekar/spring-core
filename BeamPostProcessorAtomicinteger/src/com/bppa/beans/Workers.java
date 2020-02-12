package com.bppa.beans;

public class Workers {
	private WorkRole workRole;
	private String name;
	private String area_of_work;
	public Workers(WorkRole workRole, String name, String area_of_work) {
		this.workRole = workRole;
		this.name = name;
		this.area_of_work = area_of_work;
	}
	public WorkRole getWorkRole() {
		return workRole;
	}
	public void setWorkRole(WorkRole workRole) {
		this.workRole = workRole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea_of_work() {
		return area_of_work;
	}
	public void setArea_of_work(String area_of_work) {
		this.area_of_work = area_of_work;
	}
	@Override
	public String toString() {
		return "Workers [workRole=" + workRole + ", name=" + name + ", area_of_work=" + area_of_work + "]";
	}
	
	
}
