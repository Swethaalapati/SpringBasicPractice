package com.company.springapp.companymanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.company.springapp.companymanagement.model.Company;

@Service
public class CompanyService {

	private List<Company> listOfCompanies = new ArrayList();
	
	public boolean addCompany(Company cm) {
		
		for(Company c : listOfCompanies) {
			
			if(c.getId() == cm.getId()) {
				
				return false;
			}
		}
		
		listOfCompanies.add(cm);
		return true;
	}

	public Company getCompanyById(int id) {
		
		for(Company c : listOfCompanies) {
			
			if(c.getId() == id) {
				
				return c;
			}
		}
		return null;
	}

	public List<Company> getCompanyByKeyword(String keyword) {
		
		List<Company> list = new ArrayList();
		
		if(keyword.isEmpty()) {
			
			return listOfCompanies;
		} else {
			
			for(Company c : listOfCompanies) {
				
				if(c.toString().contains(keyword)) {
					
					list.add(c);
				}
			}
		}
		return list;
	}

	public Company updateCompany(Company cm, int id) {
		
		deleteCompany(id);
		addCompany(cm);
		
		return cm;
	}

	public boolean deleteCompany(int id) {
		
		Company cc = null;
		boolean flag = false;
		
		for(Company c : listOfCompanies) {
			
			if(c.getId() == id) {
				
				cc = c;
				flag = true;
			}
		}
		if(flag) {
			
			listOfCompanies.remove(cc);
			return true;
		}
		return false;
	}

}
