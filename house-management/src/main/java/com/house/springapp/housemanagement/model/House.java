package com.house.springapp.housemanagement.model;

import java.util.Objects;

public class House {
	
	private int id;
	private String housename;
	private int noofrooms;
	
	
	public House() {
		
		
	}


	public House(int id, String housename, int noofrooms) {
		
		this.id = id;
		this.housename = housename;
		this.noofrooms = noofrooms;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHousename() {
		return housename;
	}


	public void setHousename(String housename) {
		this.housename = housename;
	}


	public int getNoofrooms() {
		return noofrooms;
	}


	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}


	@Override
	public int hashCode() {
		return Objects.hash(housename, id, noofrooms);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		return Objects.equals(housename, other.housename) && id == other.id && noofrooms == other.noofrooms;
	}


	@Override
	public String toString() {
		return "House [id=" + id + ", housename=" + housename + ", noofrooms=" + noofrooms + "]";
	}
	
}
