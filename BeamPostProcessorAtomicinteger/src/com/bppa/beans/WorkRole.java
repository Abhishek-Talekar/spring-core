package com.bppa.beans;

public class WorkRole {
	private String work_role;
	private String work_category;
	public String getWork_role() {
		return work_role;
	}
	public void setWork_role(String work_role) {
		this.work_role = work_role;
	}
	public String getWork_category() {
		return work_category;
	}
	public void setWork_category(String work_category) {
		this.work_category = work_category;
	}
	@Override
	public String toString() {
		return "WorkRole [work_role=" + work_role + ", work_category=" + work_category + "]";
	}
	
}
