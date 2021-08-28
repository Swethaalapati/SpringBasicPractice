package com.branch.springapp.branchmanagement.model;

import java.util.Objects;

public class Branch {
	
	private int id;
	private String branchname;
	private String branchhead;
	private int noofstudents;
	
	
	public Branch() {
		
		// TODO Auto-generated constructor stub
	}


	public Branch(int id, String branchname, String branchhead, int noofstudents) {
		
		this.id = id;
		this.branchname = branchname;
		this.branchhead = branchhead;
		this.noofstudents = noofstudents;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBranchname() {
		return branchname;
	}


	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}


	public String getBranchhead() {
		return branchhead;
	}


	public void setBranchhead(String branchhead) {
		this.branchhead = branchhead;
	}


	public int getNoofstudents() {
		return noofstudents;
	}


	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}


	@Override
	public int hashCode() {
		return Objects.hash(branchhead, branchname, id, noofstudents);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		return Objects.equals(branchhead, other.branchhead) && Objects.equals(branchname, other.branchname)
				&& id == other.id && noofstudents == other.noofstudents;
	}


	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchname=" + branchname + ", branchhead=" + branchhead + ", noofstudents="
				+ noofstudents + "]";
	}
		
}
