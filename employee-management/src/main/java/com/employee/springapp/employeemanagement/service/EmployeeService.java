package com.employee.springapp.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.springapp.employeemanagement.model.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> listOfEmployees = new ArrayList();

	public boolean addEmployee(Employee em) {
		
		for(Employee e : listOfEmployees) {
			
			if(e.getId() == em.getId()) {
				
				return false;
			}
		}
		listOfEmployees.add(em);
		return true;
	}

	public Employee getEmployeeById(int id) {
		
		for(Employee e : listOfEmployees) {
			
			if(e.getId() == id) {
				
				return e;
			}
		}
		return null;
	}

	public List<Employee> getEmployeeByKey(String keyword) {
		
		List<Employee> list = new ArrayList();
		
		if(keyword.isEmpty()) {
			
			return listOfEmployees;
			
		} else {
			
			for(Employee e : listOfEmployees) {
				
				if(e.toString().contains(keyword)) {
					
					list.add(e);
				}
			}
		}
		return list;
	}

	public Employee updateEmployee(Employee em, int id) {
		
		deleteEmployee(id);
		addEmployee(em);
		
		return em;
	}

	public boolean deleteEmployee(int id) {
		
		Employee emp = null;
		boolean flag = false;
		
		for(Employee e : listOfEmployees) {
			
			if(e.getId() == id) {
				
				emp = e;
				flag = true;
			}
		}
		if(flag) {
			
			listOfEmployees.remove(emp);
			return true;
		}
		return false;
	}
		
}
