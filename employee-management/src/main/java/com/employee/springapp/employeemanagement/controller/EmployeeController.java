package com.employee.springapp.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.springapp.employeemanagement.model.Employee;
import com.employee.springapp.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping (method = RequestMethod.POST, value = "/employee/add")
	public boolean addEmployee(@RequestBody Employee em)
	{
		
		return employeeService.addEmployee(em);
	}
	
	@RequestMapping (method = RequestMethod.GET, value = "/employee/get/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		
		return employeeService.getEmployeeById(id);
	}
	
	@RequestMapping (method = RequestMethod.GET, value = "/employee/get")
	public List<Employee> getEmployee(@RequestParam String keyword)
	{
		
		return employeeService.getEmployeeByKey(keyword);
	}
	
	@RequestMapping (method = RequestMethod.PUT, value = "/employee/update/{id}")
	public Employee updateEmployee(@RequestBody Employee em, @PathVariable int id) {
		
		return employeeService.updateEmployee(em, id);
	}
	
	@RequestMapping (method = RequestMethod.DELETE, value = "/employee/delete/{id}")
	public boolean deleteEmployee(@PathVariable int id)
	{
		
		return employeeService.deleteEmployee(id);
	}
}
