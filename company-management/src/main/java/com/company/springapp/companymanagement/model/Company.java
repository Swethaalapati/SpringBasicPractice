package com.company.springapp.companymanagement.model;

import java.util.Objects;

public class Company {

	private int id;
	private String name;
	private double revenue;
	private String address;
	private int noofemp;
	
	
	public Company() {
		
		// TODO Auto-generated constructor stub
	}


	public Company(int id, String name, double revenue, String address, int noofemp) {
		
		this.id = id;
		this.name = name;
		this.revenue = revenue;
		this.address = address;
		this.noofemp = noofemp;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getRevenue() {
		return revenue;
	}


	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNoofemp() {
		return noofemp;
	}


	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, noofemp, revenue);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name)
				&& noofemp == other.noofemp
				&& Double.doubleToLongBits(revenue) == Double.doubleToLongBits(other.revenue);
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", revenue=" + revenue + ", address=" + address + ", noofemp="
				+ noofemp + "]";
	}
	
	
	
}
