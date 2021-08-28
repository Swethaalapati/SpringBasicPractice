package com.company.springapp.companymanagement.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.springapp.companymanagement.model.Company;
import com.company.springapp.companymanagement.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/company/add")
	public boolean addCompany(@RequestBody Company cm)
	{
		
		return companyService.addCompany(cm);
		
	}
	
	@GetMapping(value = "/company/get/{id}")
	public Company getCompany(@PathVariable int id)
	{
		return companyService.getCompanyById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/company/get")
	public List<Company> getCompany(@RequestParam(defaultValue = "") String keyword) {
		
		return companyService.getCompanyByKeyword(keyword);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/company/update/{id}")
	public Company updateCompany(@RequestBody Company cm, @PathVariable int id) {
		
		return companyService.updateCompany(cm, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/company/delete/{id}")
	public boolean deleteCompany(@PathVariable int id) {
		
		return companyService.deleteCompany(id);
	}
	
}

