package com.employee.springapp.employeemanagement.model;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String role;
	
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, int salary, String role) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, role, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(role, other.role)
				&& salary == other.salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}
	
}
